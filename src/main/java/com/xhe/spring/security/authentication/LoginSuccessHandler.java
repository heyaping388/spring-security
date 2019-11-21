package com.xhe.spring.security.authentication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: xhe
 * @Date: 2019/11/12 14:28
 * @Description: 登录成功的处理器
 */
@Slf4j
@Component
public class LoginSuccessHandler extends AbstractAuthenticationSuccessEventHandler {


    /**
     * 处理登录成功方法
     * <p>
     * 获取到登录的authentication 对象
     *
     * @param authentication 登录对象
     * @param request        请求
     * @param response       返回
     */
    @Override
    public void handle(Authentication authentication, HttpServletRequest request, HttpServletResponse response) {
        log.info("用户：{} 登录成功", authentication.getPrincipal());
    }
}
