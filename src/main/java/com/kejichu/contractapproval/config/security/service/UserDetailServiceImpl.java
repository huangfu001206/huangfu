package com.kejichu.contractapproval.config.security.service;

import com.kejichu.contractapproval.dao.PasswordDao;
import com.kejichu.contractapproval.dao.RoleDao;
import com.kejichu.contractapproval.entity.Password;
import com.kejichu.contractapproval.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author zhaoning
 * @date 2020/10/12 - 22:52
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {


    @Resource
    private PasswordDao passwordDao;

    @Resource
    private RoleDao roleDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //获取用户
        Password user = passwordDao.selectBySno(username);
        System.out.println(user);
        if (user==null)
        {
            throw new UsernameNotFoundException("登录用户：" + username + " 不存在");
        }
        String roleId = user.getActorNum();
        String id[] = roleId.split(",");
        Role roles = null;
        String role = "";
        for (int i = 0;i < id.length; i++){
            roles=roleDao.selectByRoleId(id[i]);
            System.out.println(roles);
            String rolename = roles.getRoleName();
           // role = rolename;
            if (i == id.length-1){
                role = role + rolename;
            }else {
                role =role + rolename + ",";
            }

        }
       // user.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(roles.getRoleName()));
        user.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList(role));
        return user;

    }
}
