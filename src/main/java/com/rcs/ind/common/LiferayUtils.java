package com.rcs.ind.common;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.RoleConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.expando.model.ExpandoBridge;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class LiferayUtils {

	private final Log logger = LogFactoryUtil.getLog(LiferayUtils.class);

	public void setUserCustomFieldValue(User user, String fieldName, String value) {
		try {
			if (!user.getExpandoBridge().hasAttribute(fieldName)) {
				user.getExpandoBridge().addAttribute(fieldName);
			}

			user.getExpandoBridge().setAttribute(fieldName, value);

		} catch (PortalException e) {
			logger.error("Error setting user custom field value.", e);
		}
	}

	public String getUserCustomFieldValue(User user, String fieldName) {
		String value = "";

		if (user.getExpandoBridge().hasAttribute(fieldName)) {
			value = (String) user.getExpandoBridge().getAttribute(fieldName);
		}

		return value;
	}

	public Serializable getCustomFieldAsAdmin(ExpandoBridge expandoBridge, String attribute) {
		Serializable value = null;
		//execute this as admin
		PermissionChecker currentPermisionChecker = PermissionThreadLocal.getPermissionChecker();
		User admin = getAdmin();
		PrincipalThreadLocal.setName(admin.getUserId());
		try {
			// Create and set permission checker
			PermissionChecker permissionChecker = PermissionCheckerFactoryUtil.create(admin);
			PermissionThreadLocal.setPermissionChecker(permissionChecker);

			value = expandoBridge.getAttribute(attribute);

		} catch (Exception e) {
			logger.error("Error updating custom fields.", e);
		}
		//restore guest context
		PermissionThreadLocal.setPermissionChecker(currentPermisionChecker);
		return value;
	}

	public void updateCustomFieldAsAdmin(ExpandoBridge expandoBridge, String attribute, Serializable value) {

		//execute this as admin
		PermissionChecker currentPermisionChecker = PermissionThreadLocal.getPermissionChecker();
		User admin = getAdmin();
		PrincipalThreadLocal.setName(admin.getUserId());
		try {
			// Create and set permission checker
			PermissionChecker permissionChecker = PermissionCheckerFactoryUtil.create(admin);
			PermissionThreadLocal.setPermissionChecker(permissionChecker);

			if (!expandoBridge.hasAttribute(attribute)) {
				expandoBridge.addAttribute(attribute);
			}

			expandoBridge.setAttribute(attribute, value);

		} catch (Exception e) {
			logger.error("Error updating custom fields.", e);
		}
		//restore guest context
		PermissionThreadLocal.setPermissionChecker(currentPermisionChecker);
	}

	public User getAdmin() {
		User adminUser = null;
		try {
			Role adminRole = RoleLocalServiceUtil.getRole(PortalUtil.getDefaultCompanyId(), RoleConstants.ADMINISTRATOR);
			List<User> adminUsers = UserLocalServiceUtil.getRoleUsers(adminRole.getRoleId());
			adminUser = UserLocalServiceUtil.getDefaultUser(PortalUtil.getDefaultCompanyId());
			if (adminUsers != null && !adminUsers.isEmpty()) {
				adminUser = adminUsers.get(0);
			}
		} catch (PortalException | SystemException e) {
			logger.error("Error finding admin user. ", e);
		}
		return adminUser;
	}

}
