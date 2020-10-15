package com.kejichu.contractapproval.config.security;

import com.kejichu.contractapproval.config.security.jwt.JwtAuthTokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;

/**
 * @author zhaoning
 * @date 2020/10/12 - 22:41
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private JwtAuthTokenFilter jwtAuthTokenFilter;

    @Resource
    UserDetailsService myUserDetailsService;

    /**
     *
     *
     * @return
     * @throws Exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception
    {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        System.out.println(bCryptPasswordEncoder().encode("123456"));
        httpSecurity
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                //配置权限
                .authorizeRequests()
                .antMatchers("/login").anonymous()
                .antMatchers(
                        HttpMethod.GET,
                        "/*.html",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js"
                ).permitAll()
//                .antMatchers("/order") //需要对外暴露的资源路径
//                .hasAnyAuthority("ROLE_USER", "ROLE_ADMIN","ROLE_TEACHER")  //user角色和admin角色都可以访问
                .antMatchers("/system/user")
                .hasAnyAuthority("ROLE_TEACHER","ROLE_SUBDECANAL")  //admin角色可以访问
                .antMatchers("/system/role", "/system/menu")
                .hasAnyRole("SUBDECANAL")
                // 除上面外的所有请求全部需要鉴权认证
                .anyRequest().authenticated().and()//authenticated()要求在执行该请求时，必须已经登录了应用
                .csrf().disable() ;
        //登出功能
        httpSecurity.logout().logoutUrl("/logout");
        // 添加JWT filter
        httpSecurity.addFilterBefore(jwtAuthTokenFilter, UsernamePasswordAuthenticationFilter.class);
    }



    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }


    /**
     * 强散列哈希加密实现
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
