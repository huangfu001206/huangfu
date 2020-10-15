package com.kejichu.contractapproval.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhaoning
 * @date 2020/10/13 - 10:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    private  String roleId;

    private  String roleName;
}
