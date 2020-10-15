package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.ContractModifyDate;

public interface ContractModifyDateMapper {
    int deleteByPrimaryKey(Integer contModifyDateId);

    int insert(ContractModifyDate record);

    int insertSelective(ContractModifyDate record);

    ContractModifyDate selectByPrimaryKey(Integer contModifyDateId);

    int updateByPrimaryKeySelective(ContractModifyDate record);

    int updateByPrimaryKey(ContractModifyDate record);
}