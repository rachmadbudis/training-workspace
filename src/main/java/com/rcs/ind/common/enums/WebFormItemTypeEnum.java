package com.rcs.ind.common.enums;

public enum WebFormItemTypeEnum {
	TEXT("com.rcs.ind.web.form.item.type.text"),
	TEXTBOX("com.rcs.ind.web.form.item.type.textbox"),
	OPTIONS("com.rcs.ind.web.form.item.type.options"),
	RADIO_BUTTON("com.rcs.ind.web.form.item.type.radio.button"),
	CHECKBOX("com.rcs.ind.web.form.item.type.checkbox"),
	DATE("com.rcs.ind.web.form.item.type.date"),
	SECTION("com.rcs.ind.web.form.item.type.section");

	private final String key;

	private WebFormItemTypeEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
