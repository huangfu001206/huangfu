package com.kejichu.contractapproval.entity;

import java.util.Date;

public class ContractPass {
    private Integer contractPassId;

    private String contId;

    private String sno;

    private Date contPassTime;

    private Double contMoney;

    public Integer getContractPassId() {
        return contractPassId;
    }

    public void setContractPassId(Integer contractPassId) {
        this.contractPassId = contractPassId;
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

    public Date getContPassTime() {
        return contPassTime;
    }

    public void setContPassTime(Date contPassTime) {
        this.contPassTime = contPassTime;
    }

    public Double getContMoney() {
        return contMoney;
    }

    public void setContMoney(Double contMoney) {
        this.contMoney = contMoney;
    }
}