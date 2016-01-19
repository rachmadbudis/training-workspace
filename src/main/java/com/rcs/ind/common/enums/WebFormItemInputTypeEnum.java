package com.rcs.ind.common.enums;

public enum WebFormItemInputTypeEnum {
	ANY("com.rcs.ind.web.form.item.input.type.any"),
	ALPHANUMERIC("com.rcs.ind.web.form.item.input.type.alphanumeric"),
	ALPHABET("com.rcs.ind.web.form.item.input.type.alphabet"),
	NUMBER("com.rcs.ind.web.form.item.input.type.number"),
	EMAIL("com.rcs.ind.web.form.item.input.type.email");

	private final String key;

	private WebFormItemInputTypeEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
