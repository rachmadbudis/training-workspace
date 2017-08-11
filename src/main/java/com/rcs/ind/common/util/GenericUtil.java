package com.rcs.ind.common.util;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.UserGroupGroupRole;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.UserGroupGroupRoleLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import org.apache.commons.lang3.StringUtils;

import javax.portlet.PortletRequest;
import java.util.List;

public class GenericUtil {

	/**
	 * Check whether the given user id has the given role name
	 * 
	 * @param userId
	 * @param roleName
	 * @return
	 */
	public static boolean hasRole(long userId, String roleName) {
		boolean result = false;
		try {
			List<UserGroupGroupRole> userGroupGroupRoleList = UserGroupGroupRoleLocalServiceUtil.getUserGroupGroupRolesByUser(userId);
			for (UserGroupGroupRole userGroupGroupRole : userGroupGroupRoleList) {
				if (userGroupGroupRole.getRole() != null && StringUtils.equals(userGroupGroupRole.getRole().getName(), roleName)) {
					result = true;
					break;
				}
			}
		} catch (Exception ignored) {
		}

		return result;
	}


	
	/**
	 * Get the friendly url of given layout by it's plid
	 * @param request
	 * @param plid
	 * @return
	 */
	public static String getPageUrl(PortletRequest request, long plid) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		String redirectUrl = "";
		try {
			redirectUrl = PortalUtil.getLayoutFriendlyURL(LayoutLocalServiceUtil.getLayout(plid), themeDisplay);
		} catch (PortalException | SystemException e) {
		}
		return redirectUrl;
	}
}
