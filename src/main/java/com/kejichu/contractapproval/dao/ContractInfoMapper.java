package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.ContractInfo;

public interface ContractInfoMapper {
    int deleteByPrimaryKey(String contId);

    int insert(ContractInfo record);

    int insertSelective(ContractInfo record);

    ContractInfo selectByPrimaryKey(String contId);

    int updateByPrimaryKeySelective(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);
}