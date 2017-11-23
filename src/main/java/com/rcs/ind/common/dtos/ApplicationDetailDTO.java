package com.rcs.ind.common.dtos;

import com.rcs.ind.common.enums.ApplicationStepEnum;

import java.util.Date;

public class ApplicationDetailDTO {
    
    private ApplicationStepEnum step;
    private String result;
    private String location;
    private Date date;
    
    public ApplicationStepEnum getStep() {
        return step;
    }
    
    public void setStep(ApplicationStepEnum step) {
        this.step = step;
    }
    
    public String getResult() {
        return result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
}
