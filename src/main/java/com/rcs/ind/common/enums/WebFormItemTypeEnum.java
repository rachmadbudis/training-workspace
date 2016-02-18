package com.rcs.ind.common.enums;

public enum WebFormItemTypeEnum {
	SECTION("com.rcs.ind.web.form.item.type.section"),
	TEXT("com.rcs.ind.web.form.item.type.text"),
	TEXTBOX("com.rcs.ind.web.form.item.type.textbox"),
	OPTIONS("com.rcs.ind.web.form.item.type.options"),
	RADIO_BUTTON("com.rcs.ind.web.form.item.type.radio.button"),
	CHECKBOX("com.rcs.ind.web.form.item.type.checkbox"),
	DATE("com.rcs.ind.web.form.item.type.date");	

	private final String key;

	private WebFormItemTypeEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
