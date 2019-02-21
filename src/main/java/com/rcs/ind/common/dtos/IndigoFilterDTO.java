package com.rcs.ind.common.dtos;

public class IndigoFilterDTO {
    private String zNumber;
    private String vNumber;

    public IndigoFilterDTO() {
    }

    public String getzNumber() {
        return zNumber;
    }

    public void setzNumber(String zNumber) {
        this.zNumber = zNumber;
    }

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }
}
