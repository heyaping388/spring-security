package com.xhe.spring.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xhe
 * @Date: 2019/11/12 14:19
 * @Description:
 */
@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @PostMapping("/save")
    public void save(){
      log.info("保存成功");
    }

    @GetMapping("/list")
    public String list(){
        log.info("查询成功");
        return "查询成功";
    }

    @GetMapping("/test")
    public String test(){
        log.info("查询成功");
        return "查询成功";
    }
}
