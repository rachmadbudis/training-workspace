package com.rcs.ind.common.dtos;

import java.util.Date;

public class ApplicationDetailDTO {
    
    private String step;
    private String result;
    private String location;
    private Date date;
    
    public String getStep() {
        return step;
    }
    
    public void setStep(String step) {
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
