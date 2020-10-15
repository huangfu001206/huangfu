package com.kejichu.contractapproval.entity;

import java.util.Date;

public class ContractInfo {
    private String contId;

    private String sno;

    private String contUnit;

    private String contLeader;

    private String contName;

    private String contPartner;

    private String contCatagory;

    private Double contMoney;

    private String contPath;

    private Date contCommit;

    private String contState;

    private String contOldname;

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

    public String getContUnit() {
        return contUnit;
    }

    public void setContUnit(String contUnit) {
        this.contUnit = contUnit == null ? null : contUnit.trim();
    }

    public String getContLeader() {
        return contLeader;
    }

    public void setContLeader(String contLeader) {
        this.contLeader = contLeader == null ? null : contLeader.trim();
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName == null ? null : contName.trim();
    }

    public String getContPartner() {
        return contPartner;
    }

    public void setContPartner(String contPartner) {
        this.contPartner = contPartner == null ? null : contPartner.trim();
    }

    public String getContCatagory() {
        return contCatagory;
    }

    public void setContCatagory(String contCatagory) {
        this.contCatagory = contCatagory == null ? null : contCatagory.trim();
    }

    public Double getContMoney() {
        return contMoney;
    }

    public void setContMoney(Double contMoney) {
        this.contMoney = contMoney;
    }

    public String getContPath() {
        return contPath;
    }

    public void setContPath(String contPath) {
        this.contPath = contPath == null ? null : contPath.trim();
    }

    public Date getContCommit() {
        return contCommit;
    }

    public void setContCommit(Date contCommit) {
        this.contCommit = contCommit;
    }

    public String getContState() {
        return contState;
    }

    public void setContState(String contState) {
        this.contState = contState == null ? null : contState.trim();
    }

    public String getContOldname() {
        return contOldname;
    }

    public void setContOldname(String contOldname) {
        this.contOldname = contOldname == null ? null : contOldname.trim();
    }
}