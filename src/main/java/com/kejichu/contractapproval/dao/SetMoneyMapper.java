package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.SetMoney;

public interface SetMoneyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SetMoney record);

    int insertSelective(SetMoney record);

    SetMoney selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SetMoney record);

    int updateByPrimaryKey(SetMoney record);
}