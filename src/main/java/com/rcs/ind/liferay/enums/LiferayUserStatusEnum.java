package com.rcs.ind.liferay.enums;

public enum LiferayUserStatusEnum {
	ANY(-1),
	APPROVED(0),
	PENDING(1),
	DENIED(4),
	DRAFT(2),
	EXPIRED(3),
	IN_TRASH(8),
	INACTIVE(5),
	INCOMPLETE(6),
	SCHEDULED(7);

	private int status;

	LiferayUserStatusEnum(int status) {
		this.status = status;
	}

	public int getStatus() {
		return this.status;
	}
}
