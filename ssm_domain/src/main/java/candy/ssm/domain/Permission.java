package candy.ssm.domain;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/17 20:10
 * version 1.0
 * Description: 测试
 */

import java.util.List;

/**
 * 与数据库中的permission对应
 */
public class Permission {
    private String id;
    private String permissionName;
    private String url;
    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
