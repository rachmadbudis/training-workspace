package com.rcs.ind.common.dtos;

import java.util.List;

public class MissionStatusDTO {
    private String name;
    private List<RunnableTaskDTO> runnableTaskDTOs; 

	public MissionStatusDTO() {
	}

    public MissionStatusDTO(String name, List<RunnableTaskDTO> runnableTaskDTOs) {
        this.name = name;
        this.setRunnableTaskDTOs(runnableTaskDTOs);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RunnableTaskDTO> getRunnableTaskDTOs() {
		return runnableTaskDTOs;
	}

    public void setRunnableTaskDTOs(List<RunnableTaskDTO> runnableTaskDTOs) {
		this.runnableTaskDTOs = runnableTaskDTOs;
	}


}
