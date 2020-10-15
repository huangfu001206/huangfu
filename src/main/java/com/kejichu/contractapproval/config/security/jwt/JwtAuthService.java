package com.kejichu.contractapproval.config.security.jwt;

import com.kejichu.contractapproval.entity.Password;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhaoning
 * @date 2020/10/12 - 22:48
 */
@Service
public class JwtAuthService {
    @Resource
    private AuthenticationManager authenticationManager;

    @Resource
    private JwtTokenUtil jwtTokenUtil;

    /**
     *
     *
     * @param username 用户名
     * @param password 密码
     * @return 结果
     */
    public String login(String username, String password)  {
        Authentication authentication = null;
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception e) {
            throw new RuntimeException("用户名密码错误");
        }
        Password loginUser = (Password) authentication.getPrincipal();
        // 生成token
        return jwtTokenUtil.generateToken(loginUser);
    }
}
