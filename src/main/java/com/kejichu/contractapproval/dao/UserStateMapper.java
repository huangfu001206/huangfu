package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.UserState;

public interface UserStateMapper {
    int deleteByPrimaryKey(String stateId);

    int insert(UserState record);

    int insertSelective(UserState record);

    UserState selectByPrimaryKey(String stateId);

    int updateByPrimaryKeySelective(UserState record);

    int updateByPrimaryKey(UserState record);
}