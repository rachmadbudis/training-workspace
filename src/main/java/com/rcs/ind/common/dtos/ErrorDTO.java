package com.rcs.ind.common.dtos;

import java.io.Serializable;

public class ErrorDTO implements Serializable {

	private final static long serialVersionUID = 1L;

	private boolean hasError = false;
	private String errorMessageKey = "";

	public boolean hasError() {
		return hasError;
	}

	public void setHasError(boolean hasError) {
		this.hasError = hasError;
	}

	public String getErrorMessageKey() {
		return errorMessageKey;
	}

	public void setErrorMessageKey(String errorMessageKey) {
		this.errorMessageKey = errorMessageKey;
	}

	public static ErrorDTO buildErrorMessage(String message) {
		ErrorDTO error = new ErrorDTO();
		error.setErrorMessageKey(message);
		error.setHasError(true);
		return error;
	}

	public static ErrorDTO buildSuccessMessage(String message) {
		ErrorDTO error = new ErrorDTO();
		error.setErrorMessageKey(message);
		error.setHasError(false);
		return error;
	}
}
