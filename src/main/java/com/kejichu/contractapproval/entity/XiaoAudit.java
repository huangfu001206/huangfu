package com.kejichu.contractapproval.entity;

import java.util.Date;

public class XiaoAudit {
    private Integer id;

    private String contId;

    private String sno;

    private Date xiaoAuditTime;

    private String agree;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getXiaoAuditTime() {
        return xiaoAuditTime;
    }

    public void setXiaoAuditTime(Date xiaoAuditTime) {
        this.xiaoAuditTime = xiaoAuditTime;
    }

    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree == null ? null : agree.trim();
    }
}