package com.rcs.ind.common.dtos;

import java.util.List;

public class MissionStatusDTO {
    private String name;
    private List<RunnableTaskDTO> documents;

	public MissionStatusDTO() {
	}

    public MissionStatusDTO(String name, List<RunnableTaskDTO> documents) {
        this.name = name;
        this.documents = documents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RunnableTaskDTO> getDocuments() {
        return documents;
    }

    public void setDocuments(List<RunnableTaskDTO> documents) {
        this.documents = documents;
    }
}
