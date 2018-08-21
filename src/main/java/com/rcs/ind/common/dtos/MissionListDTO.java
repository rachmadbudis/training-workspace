package com.rcs.ind.common.dtos;

import com.rcs.ind.common.entities.dtos.MissionDTO;

import java.util.List;

public class MissionListDTO {
    List<MissionDTO> missionDTOList;

    public List<MissionDTO> getMissionDTOList() {
        return missionDTOList;
    }

    public void setMissionDTOList(List<MissionDTO> missionDTOList) {
        this.missionDTOList = missionDTOList;
    }
}
