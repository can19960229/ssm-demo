package candy.ssm.dao;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/19 15:15
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Permission;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
public interface IPermissionDao {
    //查询与role关联的所有的权限
    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id} )")
    public List<Permission> findPermissionByRoleId(String id) throws Exception;

    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    @Insert("insert into permission(id,permissionName,url) values(1,#{permissionName},#{url})")
    void save(Permission permission) throws Exception;


    @Select("select * from permission where id=#{id}")
    Permission findById(String id) throws Exception;


    @Delete("delete from role_permission where permissionId=#{id}")
    void deleteFromRole_Permission(String id) throws Exception;

    @Delete("delete from permission where id=#{id}")
    void deleteById(String id) throws Exception ;
}
