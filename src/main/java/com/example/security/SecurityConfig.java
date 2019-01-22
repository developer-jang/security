package com.example.security;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;


@Log
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        String query1 = "SELECT urid username, password password, true enabled From members WHERE urid=?";
        String query2 = "SELECT memeber urid, rolename from role WHERE member = ?";
        authenticationManagerBuilder.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery(query1).rolePrefix("ROLE_").authoritiesByUsernameQuery(query2);
    }

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
