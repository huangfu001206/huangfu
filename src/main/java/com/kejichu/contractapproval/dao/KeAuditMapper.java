package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.KeAudit;

public interface KeAuditMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KeAudit record);

    int insertSelective(KeAudit record);

    KeAudit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KeAudit record);

    int updateByPrimaryKey(KeAudit record);
}