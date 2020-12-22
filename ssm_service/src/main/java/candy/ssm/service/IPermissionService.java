package candy.ssm.service;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/21 19:55
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Permission;

import java.util.List;

/**
 *
 */
public interface IPermissionService {

    public List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;

    Permission findById(String id) throws Exception;

    void deleteById(String id) throws Exception;
}
