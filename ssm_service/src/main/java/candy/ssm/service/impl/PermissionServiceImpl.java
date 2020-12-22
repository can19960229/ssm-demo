package candy.ssm.service.impl;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/21 19:55
 * version 1.0
 * Description: 测试
 */

import candy.ssm.dao.IPermissionDao;
import candy.ssm.domain.Permission;
import candy.ssm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private IPermissionDao permissionDao;

    @Override
    public List<Permission> findAll() throws Exception {
        return permissionDao.findAll();
    }

    @Override
    public void save(Permission permission) throws Exception {
        permissionDao.save(permission);
    }

    @Override
    public Permission findById(String id) throws Exception {
        return permissionDao.findById(id);
    }

    @Override
    public void deleteById(String id) throws Exception {
        //permission在中间表中有数据的，则先从中间表删除
        permissionDao.deleteFromRole_Permission(id);
        permissionDao.deleteById(id);
    }

}
