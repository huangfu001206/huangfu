package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.FuAudit;

public interface FuAuditMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FuAudit record);

    int insertSelective(FuAudit record);

    FuAudit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FuAudit record);

    int updateByPrimaryKey(FuAudit record);
}