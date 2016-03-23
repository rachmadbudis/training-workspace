package com.rcs.ind.liferay.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

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
	HOST("Host", LiferayRoleTypeEnum.SITE),
	EMPLOYEE("Employee", LiferayRoleTypeEnum.SITE),
	TRANSLATOR("Translator", LiferayRoleTypeEnum.SITE),
	INTERVIEWER("Interviewer", LiferayRoleTypeEnum.SITE),
	SUPERVISOR("Supervisor", LiferayRoleTypeEnum.SITE),
	AVIM("Avim", LiferayRoleTypeEnum.SITE),
	PLANNER("Planner", LiferayRoleTypeEnum.SITE),
	AR_SY("Language Arabic Syria", LiferayRoleTypeEnum.SITE),
	TI_ER("Language Tigrinya Eritrea", LiferayRoleTypeEnum.SITE),

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
		return EnumSet.of(HOST, EMPLOYEE, TRANSLATOR, INTERVIEWER, SUPERVISOR, AVIM, PLANNER);
	}

	/**
	 * Get Language roles
	 * 
	 * @return
	 */
	public static EnumSet<LiferayRoleEnum> getLanguageRoles() {
		return EnumSet.of(AR_SY, TI_ER);
	}

	public static Set<Locale> getLanguageLocaleByRole(Set<String> userRoles) {
		Set<Locale> langRoles = new HashSet<>();
		for (LiferayRoleEnum langRoleEnum : LiferayRoleEnum.getLanguageRoles()) {
			if (userRoles.contains(langRoleEnum.getName())) {
				String[] localeString = langRoleEnum.name().split("_");
				langRoles.add(new Locale(localeString[0],localeString[1]));
			}
		}
		return langRoles;
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