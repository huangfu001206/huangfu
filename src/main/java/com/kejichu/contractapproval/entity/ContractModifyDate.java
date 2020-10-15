package com.kejichu.contractapproval.entity;

import java.util.Date;

public class ContractModifyDate {
    private Integer contModifyDateId;

    private String contId;

    private Date contModifyData;

    public Integer getContModifyDateId() {
        return contModifyDateId;
    }

    public void setContModifyDateId(Integer contModifyDateId) {
        this.contModifyDateId = contModifyDateId;
    }

    public String getContId() {
        return contId;
    }

    public void setContId(String contId) {
        this.contId = contId == null ? null : contId.trim();
    }

    public Date getContModifyData() {
        return contModifyData;
    }

    public void setContModifyData(Date contModifyData) {
        this.contModifyData = contModifyData;
    }
}