package com.rcs.ind.common.dtos;

public class MissionStatusDTO {
    String name;
    String status;
    String errorMessage;

    
	public MissionStatusDTO() {
	}
    
    public MissionStatusDTO(String name, String status, String errorMessage) {
        this.name = name;
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
