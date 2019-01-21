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
//        antMatchers는 특정경로, authorizeRequests()는 HttpServletReuest를 이용한다는 것.

        httpSecurity.formLogin(); //별도의 로그인 화면 지원
    }
}
