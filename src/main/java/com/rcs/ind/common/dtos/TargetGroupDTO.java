package com.rcs.ind.common.dtos;

public class TargetGroupDTO {
    private long targetGroupId;
    private String name;
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

    public boolean getSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
