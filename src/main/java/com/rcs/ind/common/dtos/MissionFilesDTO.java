package com.rcs.ind.common.dtos;

import com.rcs.ind.common.entities.dtos.GeneralDocumentDTO;

import java.util.List;

public class MissionFilesDTO {
    private Long missionId;
    private String name;
    private String targetGroup;
    private List<GeneralDocumentDTO> files;
}
