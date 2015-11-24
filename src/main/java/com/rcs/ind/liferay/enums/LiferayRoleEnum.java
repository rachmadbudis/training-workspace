package com.rcs.ind.liferay.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

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
	HOST("Host", LiferayRoleTypeEnum.REGULAR),

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

	public boolean equals(String name) {
		return this.getName().equals(name);
	}

	/**
	 * Get IND specific role
	 * 
	 * @param index
	 * @return
	 */
	public static EnumSet<LiferayRoleEnum> getIndRoles() {
		return EnumSet.of(EMPLOYEE, TRANSLATOR, INTERVIEWER, SUPERVISOR);
	}

	private static final Map<String, LiferayRoleEnum> LOOKUP = new HashMap<>();
	static {
		for (LiferayRoleEnum role : LiferayRoleEnum.values()) {
			LOOKUP.put(role.getName(), role);
		}
	}

	public static boolean contains(String name) {
		return LOOKUP.containsKey(name);
	}

	/**
	 * Get dataset permission type by key
	 * 
	 * @param key
	 * @return
	 */
	public static LiferayRoleEnum get(String key) {
		return LOOKUP.get(key);
	}
}