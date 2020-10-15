package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.FaAudit;

public interface FaAuditMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FaAudit record);

    int insertSelective(FaAudit record);

    FaAudit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FaAudit record);

    int updateByPrimaryKey(FaAudit record);
}