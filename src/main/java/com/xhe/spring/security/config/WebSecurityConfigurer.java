package com.xhe.spring.security.config;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Auther: xhe
 * @Date: 2019/11/12 14:25
 * @Description:
 */
@Primary
@Order(90)
@Configuration
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/token/login")
                .loginProcessingUrl("/token/form")
                //.failureHandler(authenticationFailureHandler())
                //.successHandler(authenticationSuccessHandler)
            .and()
                .authorizeRequests()
                .antMatchers("/token/**","/actuator/**","/oauth/**").permitAll()
                .anyRequest()
                .authenticated()
            .and()
                .csrf().disable();
    }



    @Bean
    @Override
    @SneakyThrows
    public AuthenticationManager authenticationManagerBean() {
        return super.authenticationManagerBean();
    }

}
