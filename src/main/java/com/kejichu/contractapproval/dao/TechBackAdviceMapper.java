package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.TechBackAdvice;

public interface TechBackAdviceMapper {
    int deleteByPrimaryKey(Integer techAdviId);

    int insert(TechBackAdvice record);

    int insertSelective(TechBackAdvice record);

    TechBackAdvice selectByPrimaryKey(Integer techAdviId);

    int updateByPrimaryKeySelective(TechBackAdvice record);

    int updateByPrimaryKey(TechBackAdvice record);
}