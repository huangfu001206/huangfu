package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String sno);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String sno);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}