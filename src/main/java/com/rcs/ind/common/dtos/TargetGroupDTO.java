package com.rcs.ind.common.dtos;

public class TargetGroupDTO extends GenericEntityDTO {
    private long id;
    private String name;
    private String interviewTemplate;
    private String minuteTemplate;
    private String decisionTemplate;
    private boolean selected;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getMinuteTemplate() {
        return minuteTemplate;
    }

    public void setMinuteTemplate(String minuteTemplate) {
        this.minuteTemplate = minuteTemplate;
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
