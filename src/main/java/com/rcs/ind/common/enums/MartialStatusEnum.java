package com.rcs.ind.common.enums;


public enum MartialStatusEnum {
	Single ("Single"),
	Married("Married"),
	Divorced("Divorced"),
	Widowed("Widowed");/* TODO: sample*/

	private final String key;

	private MartialStatusEnum(String key) {
		this.key = key;
	}	
}
