package com.rcs.ind.liferay.enums;

public enum LiferayRoleTypeEnum {
	REGULAR(1, "Regular"),
	SITE(2, "Site"),
	ORGANIZATION(3, "Organization");

	private int type;
	private String name;

	LiferayRoleTypeEnum(int type, String name) {
		this.type = type;
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public String getName() {
		return name;
	}
}
