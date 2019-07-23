package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.MissionStatusEnum;

import java.util.Date;

public class MissionGridDTO {
    private Long missionId;
    private String name;
    private String targetGroup;
    private boolean customerExists;
    private MissionStatusEnum status;
    private boolean goPackagesAvailable;
    private boolean formInProgress;
    private boolean brpInProgress;
    private boolean goPackageInProgress;
    private boolean defListInProgress;
    private boolean filesAvailable;
    private Date ricEndDate;

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }

    public Boolean getCustomerExists() {
        return customerExists;
    }

    public void setCustomerExists(Boolean customerExists) {
        this.customerExists = customerExists;
    }

    public MissionStatusEnum getStatus() {
        return status;
    }

    public void setStatus(MissionStatusEnum status) {
        this.status = status;
    }

    public Boolean getGoPackagesAvailable() {
        return goPackagesAvailable;
    }

    public void setGoPackagesAvailable(Boolean goPackagesAvailable) {
        this.goPackagesAvailable = goPackagesAvailable;
    }

    public Boolean getFormInProgress() {
        return formInProgress;
    }

    public void setFormInProgress(Boolean formInProgress) {
        this.formInProgress = formInProgress;
    }

    public Boolean getBrpInProgress() {
        return brpInProgress;
    }

    public void setBrpInProgress(Boolean brpInProgress) {
        this.brpInProgress = brpInProgress;
    }

    public Boolean getGoPackageInProgress() {
        return goPackageInProgress;
    }

    public void setGoPackageInProgress(Boolean goPackageInProgress) {
        this.goPackageInProgress = goPackageInProgress;
    }

    public Boolean getDefListInProgress() {
        return defListInProgress;
    }

    public void setDefListInProgress(Boolean defListInProgress) {
        this.defListInProgress = defListInProgress;
    }

    public Boolean getFilesAvailable() {
        return filesAvailable;
    }

    public void setFilesAvailable(Boolean filesAvailable) {
        this.filesAvailable = filesAvailable;
    }

}
