package com.rcs.ind.common.enums;

public enum WebFormItemTypeEnum {
	PARAGRAPH_ITALIC("com.rcs.ind.web.form.item.type.paragraph.italic"),
	TEXT("com.rcs.ind.web.form.item.type.text"),
	TEXTBOX("com.rcs.ind.web.form.item.type.textbox"),
	OPTIONS("com.rcs.ind.web.form.item.type.options"),
	RADIO_BUTTON("com.rcs.ind.web.form.item.type.radio.button"),
	CHECKBOX("com.rcs.ind.web.form.item.type.checkbox"),
	DATE("com.rcs.ind.web.form.item.type.date"),
	TITLE("com.rcs.ind.web.form.item.type.title"),
	LIST("com.rcs.ind.web.form.item.type.list"),
	PAGE_BREAK("com.rcs.ind.web.form.item.type.parameter"),
	SPACER("com.rcs.ind.web.form.item.type.spacer"),
	PARAGRAPH_NORMAL("com.rcs.ind.web.form.item.type.paragraph.normal"),
	;	

	private final String key;

	private WebFormItemTypeEnum(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

}
