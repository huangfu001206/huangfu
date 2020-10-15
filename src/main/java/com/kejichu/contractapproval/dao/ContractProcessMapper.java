package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.ContractProcess;

public interface ContractProcessMapper {
    int deleteByPrimaryKey(String contId);

    int insert(ContractProcess record);

    int insertSelective(ContractProcess record);

    ContractProcess selectByPrimaryKey(String contId);

    int updateByPrimaryKeySelective(ContractProcess record);

    int updateByPrimaryKey(ContractProcess record);
}