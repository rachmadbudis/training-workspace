package com.rcs.ind.liferay.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rcs.ind.liferay.dtos.LiferayRoleDTO;

/**
 * Liferay Roles.
 */
public enum LiferayRoleEnum {
	// Regular Roles.
	ADMINISTRATOR("Administrator", LiferayRoleTypeEnum.REGULAR),
	GUEST("Guest", LiferayRoleTypeEnum.REGULAR),
	OWNER("Owner", LiferayRoleTypeEnum.REGULAR),
	POWER_USER("Power User", LiferayRoleTypeEnum.REGULAR),
	USER("User", LiferayRoleTypeEnum.REGULAR),

	// IND
	EMPLOYEE("Employee", LiferayRoleTypeEnum.REGULAR),
	TRANSLATOR("Translator", LiferayRoleTypeEnum.REGULAR),
	INTERVIEWER("Interviewer", LiferayRoleTypeEnum.REGULAR),
	SUPERVISOR("Supervisor", LiferayRoleTypeEnum.REGULAR),
	
	// Site Roles.
	SITE_ADMINISTRATOR("Site Administrator", LiferayRoleTypeEnum.SITE),
	SITE_MEMBER("Site Member", LiferayRoleTypeEnum.SITE),
	SITE_OWNER("Site Owner", LiferayRoleTypeEnum.SITE),

	// Organization Roles.
	ORGANIZATION_ADMINISTRATOR("Organization Administrator", LiferayRoleTypeEnum.ORGANIZATION),
	ORGANIZATION_OWNER("Organization Owner", LiferayRoleTypeEnum.ORGANIZATION),
	ORGANIZATION_USER("Organization User", LiferayRoleTypeEnum.ORGANIZATION);

	private String name;
	private LiferayRoleTypeEnum type;

	LiferayRoleEnum(String name, LiferayRoleTypeEnum type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public LiferayRoleTypeEnum getType() {
		return this.type;
	}
	
	public boolean equals(LiferayRoleDTO role) {
		return equals(role.getName());
	}
	
	public boolean equals(String name) {
		return this.getName().equals(name);
	}
	
	/**
	 * Get IND specific role
	 * 
	 * @param index
	 * @return
	 */
	public static List<LiferayRoleEnum> getIndRoles() {
		return Arrays.asList(EMPLOYEE, TRANSLATOR, INTERVIEWER, SUPERVISOR);
	}
}