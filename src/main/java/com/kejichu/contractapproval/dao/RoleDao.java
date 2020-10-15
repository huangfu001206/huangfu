package com.kejichu.contractapproval.dao;

import com.kejichu.contractapproval.entity.Role;

import java.util.List;

/**
 * @author zhaoning
 * @date 2020/10/13 - 11:04
 */
public interface RoleDao {

    Role selectByRoleId(String roleId);
}
