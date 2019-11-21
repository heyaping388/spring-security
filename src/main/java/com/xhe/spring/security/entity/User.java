package com.xhe.spring.security.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * <p>
 * 用户
 * </p>
 *
 * @package: com.xkcoding.rbac.security.model
 * @description: 用户
 * @author: yangkai.shen
 * @date: Created in 2018-12-07 16:00
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
public class User {

    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 生日
     */
    private Long birthday;

    /**
     * 性别，男-1，女-2
     */
    private Integer sex;

    /**
     * 状态，启用-1，禁用-0
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;
}
