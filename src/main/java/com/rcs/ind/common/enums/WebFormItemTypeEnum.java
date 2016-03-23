package com.rcs.ind.common.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum WebFormItemTypeEnum {
	PARAGRAPH_ITALIC("com.rcs.ind.web.form.item.type.paragraph.italic", true),
	TEXT("com.rcs.ind.web.form.item.type.text", true),
	TEXTBOX("com.rcs.ind.web.form.item.type.textbox", true),
	OPTIONS("com.rcs.ind.web.form.item.type.options", true),
	RADIO_BUTTON("com.rcs.ind.web.form.item.type.radio.button", true),
	CHECKBOX("com.rcs.ind.web.form.item.type.checkbox", true),
	DATE("com.rcs.ind.web.form.item.type.date", true),
	TITLE("com.rcs.ind.web.form.item.type.title", true),
	LIST("com.rcs.ind.web.form.item.type.list"),
	PAGE_BREAK("com.rcs.ind.web.form.item.type.parameter", true),
	SPACER("com.rcs.ind.web.form.item.type.spacer", true),
	PARAGRAPH_NORMAL("com.rcs.ind.web.form.item.type.paragraph.normal"), ;

	private final String key;
	private final boolean isUserAppliedType;
	public static final EnumSet<WebFormItemTypeEnum> USER_APPLIED_TYPE;

	static {
		USER_APPLIED_TYPE = EnumSet.noneOf(WebFormItemTypeEnum.class);
		for (WebFormItemTypeEnum entry : values()) {
			if(entry.isUserAppliedType) {
				USER_APPLIED_TYPE.add(entry);
			}
		}
	}

	private WebFormItemTypeEnum(String key) {
		this.key = key;
		this.isUserAppliedType = false;
	}

	private WebFormItemTypeEnum(String key, boolean isUserAppliedType) {
		this.key = key;
		this.isUserAppliedType = isUserAppliedType;
	}
	
	public String getKey() {
		return key;
	}
}
