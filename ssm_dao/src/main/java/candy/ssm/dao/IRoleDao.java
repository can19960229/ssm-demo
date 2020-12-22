package candy.ssm.dao;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/17 21:14
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Permission;
import candy.ssm.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 */
public interface IRoleDao {

    //根据用户id查询出所有用户的角色
    //通过中间表通过userId查询出所有的roleId，再从角色表中找出和它匹配的role对象
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roleName",column = "roleName"),
            @Result(property = "roleDesc",column = "roleDesc"),
            @Result(property = "permissions",column = "id",javaType = java.util.List.class,many = @Many(select = "candy.ssm.dao.IPermissionDao.findPermissionByRoleId"))
    })
    public List<Role> findRoleByUserId(String userId) throws Exception;

    @Select("select * from role")
    List<Role> findAll();


    @Insert("insert into role(id,roleName,roleDesc) values(1,#{roleName},#{roleDesc})")
    void save(Role role);



    @Delete("delete from users_role where roleId=#{roleId}")
    void deleteFromUser_RoleByRoleId(String roleId);

    @Delete("delete from role_permission where roleId=#{roleId}")
    void deleteFromRole_PermissionByRoleId(String roleId);

    @Delete("delete from role where id=#{roleId}")
    void deleteRoleById(String roleId);


    @Select("select * from role where id = #{roleId}")
//    @Results({
//            @Result(id = true,property = "id",column = "id"),
//            @Result(property = "roleName",column = "roleName"),
//            @Result(property = "roleDesc",column = "roleDesc"),
//            @Result(property = "permission",column = "id",javaType = java.util.List.class,many = @Many(select = "candy.ssm.dao.IPermissionDao.findPermissionByRoleId"))
//    })
    Role findById(String roleId);

    @Select("select * from permission where id not in (select permissionId from role_permission where roleId = #{roleId})")
    List<Permission> findOtherPermissions(String roleId);


    @Insert("insert into role_permission(roleId,permissionId) values (#{roleId},#{permissionId})")
    void addPermissionToRole(@Param("roleId") String roleId,@Param("permissionId") String permissionId);

}
