package com.rcs.ind.common.filters.dtos;

import java.util.List;

import com.rcs.ind.common.dtos.PaginationFiltersDTO;
import com.rcs.ind.common.enums.RunnableTaskStatusEnum;
import com.rcs.ind.common.enums.RunnableTaskTypeEnum;

public class MissionFileFiltersDTO extends PaginationFiltersDTO {

	private long missionId;
	private String name;
	private List<String> names;
	private List<RunnableTaskStatusEnum> statuses;
	private List<RunnableTaskTypeEnum> taskTypes;
	private Boolean active;

	public long getMissionId() {
		return missionId;
	}

	public void setMissionId(long missionId) {
		this.missionId = missionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<RunnableTaskStatusEnum> getStatuses() {
		return statuses;
	}

	public void setStatuses(List<RunnableTaskStatusEnum> statuses) {
		this.statuses = statuses;
	}

	public List<RunnableTaskTypeEnum> getTaskTypes() {
		return taskTypes;
	}

	public void setTaskTypes(List<RunnableTaskTypeEnum> taskTypes) {
		this.taskTypes = taskTypes;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
