package com.example.security;

import lombok.extern.java.Log;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Log
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        log.info("security Config....");
        httpSecurity.authorizeRequests().antMatchers("/guest/**").permitAll();
        httpSecurity.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
        httpSecurity.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
//        antMatchers는 특정경로, authorizeRequests()는 HttpServletReuest를 이용한다는 것.

//       Login
//        httpSecurity.formLogin(); //별도의 로그인 화면 지원
        httpSecurity.formLogin().loginPage("/login");

//        Logout
//        httpSecurity.logout().invalidateHttpSession(true); 별도의 로그아웃 화면 없는 경우
        httpSecurity.logout().logoutUrl("/logout").invalidateHttpSession(true);
    }
}
