package com.kejichu.contractapproval.entity;

public class Complaint extends ComplaintKey {
    private String adviContent;

    private String adviState;

    public String getAdviContent() {
        return adviContent;
    }

    public void setAdviContent(String adviContent) {
        this.adviContent = adviContent == null ? null : adviContent.trim();
    }

    public String getAdviState() {
        return adviState;
    }

    public void setAdviState(String adviState) {
        this.adviState = adviState == null ? null : adviState.trim();
    }
}