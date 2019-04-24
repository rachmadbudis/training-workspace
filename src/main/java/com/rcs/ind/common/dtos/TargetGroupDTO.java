package com.rcs.ind.common.dtos;

public class TargetGroupDTO {
    private long targetGroupId;
    private String name;
    private String interviewTemplate;
    private String minuutTemplate;
    private String decisionTemplate;
    private boolean selected;

    public long getTargetGroupId() {
        return targetGroupId;
    }

    public void setTargetGroupId(long targetGroupId) {
        this.targetGroupId = targetGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterviewTemplate() {
        return interviewTemplate;
    }

    public void setInterviewTemplate(String interviewTemplate) {
        this.interviewTemplate = interviewTemplate;
    }

    public String getMinuutTemplate() {
        return minuutTemplate;
    }

    public void setMinuutTemplate(String minuutTemplate) {
        this.minuutTemplate = minuutTemplate;
    }

    public String getDecisionTemplate() {
        return decisionTemplate;
    }

    public void setDecisionTemplate(String decisionTemplate) {
        this.decisionTemplate = decisionTemplate;
    }

    public boolean getSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
