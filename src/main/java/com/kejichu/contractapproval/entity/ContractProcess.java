package com.kejichu.contractapproval.entity;

public class ContractProcess {
    private String contId;

    private String contState;

    public String getContId() {
        return contId;
    }

    public void setContId(String contId) {
        this.contId = contId == null ? null : contId.trim();
    }

    public String getContState() {
        return contState;
    }

    public void setContState(String contState) {
        this.contState = contState == null ? null : contState.trim();
    }
}