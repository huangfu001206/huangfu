package com.kejichu.contractapproval.config.security.jwt;

import com.kejichu.contractapproval.common.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoning
 * @date 2020/10/12 - 22:48
 */
@RestController
public class JwtLoginController {
    @Autowired
    JwtAuthService jwtAuthService;

    /**
     *
     *
     * @param username 用户名
     * @param password 密码
     * @return 结果
     */
    @PostMapping({"/login", "/"})
    public RestResult login(String username, String password) {
        RestResult result = RestResult.success();
        String token = jwtAuthService.login(username, password);
        result.put("token", token);
        return result;
    }
}
