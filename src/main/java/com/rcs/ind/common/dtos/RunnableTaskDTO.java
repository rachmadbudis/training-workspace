package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.RunnableTaskStatusEnum;
import com.rcs.ind.common.enums.RunnableTaskTypeEnum;

public class RunnableTaskDTO {
    private RunnableTaskTypeEnum taskType;
    private RunnableTaskStatusEnum status;
    private String notes;
    private String mission;

    public RunnableTaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(RunnableTaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public RunnableTaskStatusEnum getStatus() {
        return status;
    }

    public void setStatus(RunnableTaskStatusEnum status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }
}
