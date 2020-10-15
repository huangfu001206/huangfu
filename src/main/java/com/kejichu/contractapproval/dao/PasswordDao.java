package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.Password;

/**
 * @author zhaoning
 * @date 2020/10/13 - 10:59
 */
public interface PasswordDao {

    Password selectBySno(String sno);
}
