package com.example.security.controller;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log
public class LoginController {

    @GetMapping("/login")
    public void login() {
//        2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 1 of 12 in additional filter chain; firing Filter: 'WebAsyncManagerIntegrationFilter'
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 2 of 12 in additional filter chain; firing Filter: 'SecurityContextPersistenceFilter'
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] w.c.HttpSessionSecurityContextRepository : HttpSession returned null object for SPRING_SECURITY_CONTEXT
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] w.c.HttpSessionSecurityContextRepository : No SecurityContext was available from the HttpSession: org.apache.catalina.session.StandardSessionFacade@10b99cec. A new one will be created.
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 3 of 12 in additional filter chain; firing Filter: 'HeaderWriterFilter'
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 4 of 12 in additional filter chain; firing Filter: 'CsrfFilter'
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 5 of 12 in additional filter chain; firing Filter: 'LogoutFilter'
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.u.matcher.AntPathRequestMatcher  : Request 'GET /login' doesn't match 'POST /logout'
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 6 of 12 in additional filter chain; firing Filter: 'UsernamePasswordAuthenticationFilter'
//2019-01-21 22:48:36.742 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.u.matcher.AntPathRequestMatcher  : Request 'GET /login' doesn't match 'POST /login'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 7 of 12 in additional filter chain; firing Filter: 'RequestCacheAwareFilter'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.s.DefaultSavedRequest            : pathInfo: both null (property equals)
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.s.DefaultSavedRequest            : queryString: arg1=null; arg2=error (property not equals)
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.s.HttpSessionRequestCache        : saved request doesn't match
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 8 of 12 in additional filter chain; firing Filter: 'SecurityContextHolderAwareRequestFilter'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 9 of 12 in additional filter chain; firing Filter: 'AnonymousAuthenticationFilter'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.a.AnonymousAuthenticationFilter  : Populated SecurityContextHolder with anonymous token: 'org.springframework.security.authentication.AnonymousAuthenticationToken@15b331da: Principal: anonymousUser; Credentials: [PROTECTED]; Authenticated: true; Details: org.springframework.security.web.authentication.WebAuthenticationDetails@fffde5d4: RemoteIpAddress: 0:0:0:0:0:0:0:1; SessionId: CE8BBA0D0CF2A67EF0BD128AF59F3F2D; Granted Authorities: ROLE_ANONYMOUS'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 10 of 12 in additional filter chain; firing Filter: 'SessionManagementFilter'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 11 of 12 in additional filter chain; firing Filter: 'ExceptionTranslationFilter'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error at position 12 of 12 in additional filter chain; firing Filter: 'FilterSecurityInterceptor'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.u.matcher.AntPathRequestMatcher  : Checking match of request : '/login'; against '/guest/**'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.u.matcher.AntPathRequestMatcher  : Checking match of request : '/login'; against '/manager/**'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.u.matcher.AntPathRequestMatcher  : Checking match of request : '/login'; against '/admin/**'
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.s.w.a.i.FilterSecurityInterceptor    : Public object - authentication not attempted
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.security.web.FilterChainProxy        : /login?error reached end of additional filter chain; proceeding with original chain
//2019-01-21 22:48:36.743 DEBUG 708 --- [nio-8080-exec-7] o.s.web.servlet.DispatcherServlet        : GET "/login?error", parameters={masked}
//2019-01-21 22:48:36.744 DEBUG 708 --- [nio-8080-exec-7] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped to public void com.example.security.controller.LoginController.login()
//2019-01-21 22:48:36.744  INFO 708 --- [nio-8080-exec-7] c.e.security.controller.LoginController  : /login
        log.info("/login");
    }

    @GetMapping("/logout")
    public void logout() {

    }
}
