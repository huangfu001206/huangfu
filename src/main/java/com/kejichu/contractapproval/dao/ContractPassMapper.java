package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.ContractPass;

public interface ContractPassMapper {
    int deleteByPrimaryKey(Integer contractPassId);

    int insert(ContractPass record);

    int insertSelective(ContractPass record);

    ContractPass selectByPrimaryKey(Integer contractPassId);

    int updateByPrimaryKeySelective(ContractPass record);

    int updateByPrimaryKey(ContractPass record);
}