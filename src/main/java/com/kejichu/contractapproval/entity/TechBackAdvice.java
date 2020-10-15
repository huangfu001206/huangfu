package com.kejichu.contractapproval.entity;

import java.util.Date;

public class TechBackAdvice {
    private Integer techAdviId;

    private String contId;

    private String sno;

    private String whetAdvice;

    private String reason;

    private Date backAdviTime;

    public Integer getTechAdviId() {
        return techAdviId;
    }

    public void setTechAdviId(Integer techAdviId) {
        this.techAdviId = techAdviId;
    }

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

    public String getWhetAdvice() {
        return whetAdvice;
    }

    public void setWhetAdvice(String whetAdvice) {
        this.whetAdvice = whetAdvice == null ? null : whetAdvice.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getBackAdviTime() {
        return backAdviTime;
    }

    public void setBackAdviTime(Date backAdviTime) {
        this.backAdviTime = backAdviTime;
    }
}