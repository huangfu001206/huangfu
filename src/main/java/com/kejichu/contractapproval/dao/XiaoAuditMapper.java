package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.XiaoAudit;

public interface XiaoAuditMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XiaoAudit record);

    int insertSelective(XiaoAudit record);

    XiaoAudit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XiaoAudit record);

    int updateByPrimaryKey(XiaoAudit record);
}