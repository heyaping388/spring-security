package com.xhe.spring.security.authentication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: xhe
 * @Date: 2019/11/21 15:55
 * @Description: 登录失败的处理器
 */
@Slf4j
@Component
public class LoginFailureHandler extends AbstractAuthenticationFailureEvenHandler {


    /**
     * 处理登录失败方法
     * <p>
     *
     * @param authenticationException 登录的authentication 对象
     * @param authentication          登录的authenticationException 对象
     * @param request                 请求
     * @param response                响应
     */
    @Override
    public void handle(AuthenticationException authenticationException, Authentication authentication, HttpServletRequest request, HttpServletResponse response) {
        log.info("用户：{} 登录失败，异常：{}", authentication.getPrincipal(), authenticationException.getLocalizedMessage());
    }
}
