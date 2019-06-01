package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.RunnableTaskStatusEnum;
import com.rcs.ind.common.enums.RunnableTaskTypeEnum;

public class RunnableTaskDTO {
    private RunnableTaskTypeEnum taskType;
    private RunnableTaskStatusEnum status;
    private String message;
    private String mission;
    private String name;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
