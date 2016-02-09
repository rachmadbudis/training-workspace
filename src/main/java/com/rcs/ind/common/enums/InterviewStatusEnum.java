package com.rcs.ind.common.enums;

public enum InterviewStatusEnum {
	NEW("com.rcs.ind.interview.status.new"),
	PREPARED("com.rcs.ind.interview.status.prepared"),
	FINISHED("com.rcs.ind.interview.status.finished");
	
	private final String key;

	private InterviewStatusEnum(String key) {
		this.key = key;
	}
	
	public String getKey() {
		return key;
	}
}
