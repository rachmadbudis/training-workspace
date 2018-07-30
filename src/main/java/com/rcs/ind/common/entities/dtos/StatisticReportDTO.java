package com.rcs.ind.common.entities.dtos;

public class StatisticReportDTO {

    private String requester;
    private String startDate;
    private String endDate;
    private String smartflowNumber;
    private int totalRecords;
    private boolean result;

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
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
