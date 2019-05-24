package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.DocumentTypeEnum;
import com.rcs.ind.common.enums.RunnableTaskStatusEnum;

import java.util.List;
import java.util.Map;

public class MissionStatusDTO {
    String name;
    List<String> errorMessages;
    Map<DocumentTypeEnum, RunnableTaskStatusEnum> documentMap;

	public MissionStatusDTO() {
	}

    public MissionStatusDTO(String name, List<String> errorMessages, Map<DocumentTypeEnum, RunnableTaskStatusEnum> documentMap) {
        this.name = name;
        this.errorMessages = errorMessages;
        this.documentMap = documentMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public Map<DocumentTypeEnum, RunnableTaskStatusEnum> getDocumentMap() {
        return documentMap;
    }

    public void setDocumentMap(Map<DocumentTypeEnum, RunnableTaskStatusEnum> documentMap) {
        this.documentMap = documentMap;
    }
}
