package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.Complaint;
import com.kejichu.contractapproval.entity.ComplaintKey;

public interface ComplaintMapper {
    int deleteByPrimaryKey(ComplaintKey key);

    int insert(Complaint record);

    int insertSelective(Complaint record);

    Complaint selectByPrimaryKey(ComplaintKey key);

    int updateByPrimaryKeySelective(Complaint record);

    int updateByPrimaryKey(Complaint record);
}