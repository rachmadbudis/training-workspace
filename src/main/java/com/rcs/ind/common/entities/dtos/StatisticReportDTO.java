package com.rcs.ind.common.entities.dtos;

import java.util.Date;

public class StatisticReportDTO {

    private String requester;
    private Date startDate;
    private Date endDate;
    private String smartflowNumber;
    private int totalRecords;
    private boolean result;

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getSmartflowNumber() {
        return smartflowNumber;
    }

    public void setSmartflowNumber(String smartflowNumber) {
        this.smartflowNumber = smartflowNumber;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
