package candy.ssm.service;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/21 19:23
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Role;

import java.util.List;

/**
 *
 */
public interface IRoleService  {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;

    void deleteRoleById(String roleId);
}
