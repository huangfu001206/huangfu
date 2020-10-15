package com.kejichu.contractapproval.entity;

import java.util.Date;

public class ComplaintKey {
    private String contId;

    private String sno;

    private Date adviTime;

    public String getContId() {
        return contId;
    }

    public void setContId(String contId) {
        this.contId = contId == null ? null : contId.trim();
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public Date getAdviTime() {
        return adviTime;
    }

    public void setAdviTime(Date adviTime) {
        this.adviTime = adviTime;
    }
}