package com.xhe.spring.security.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * <p>
 * 角色
 * </p>
 *
 * @package: com.xkcoding.rbac.security.model
 * @description: 角色
 * @author: yangkai.shen
 * @date: Created in 2018-12-07 15:45
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
public class Role {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;
}
