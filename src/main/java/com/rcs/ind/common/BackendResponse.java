package com.rcs.ind.common;

import com.rcs.ind.common.util.JsonConverter;

public abstract class BackendResponse {

	private JsonConverter converter = new JsonConverter();

	public String toString() {
		return converter.toJson(this);
	}
}
