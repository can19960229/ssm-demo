package candy.ssm.dao;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/16 10:36
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Member;
import candy.ssm.domain.Orders;
import candy.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 */
public interface IOrdersDao  {


    @Select("select * from orders")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property =  "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one =@One(select = "candy.ssm.dao.IProductDao.findById"))
    })
    public List<Orders> findAll() throws Exception;


    //多表操作
    @Select("select * from orders where id=#{ordersId}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property =  "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one =@One(select = "candy.ssm.dao.IProductDao.findById")),
            @Result(property = "member",column = "memberId",javaType = Member.class,one = @One(select = "candy.ssm.dao.IMemberDao.findById")),
            @Result(property = "travellers",column = "id" ,javaType = java.util.List.class,many = @Many(select = "candy.ssm.dao.ITravellerDao.findByOrdersId"))
    })
    public Orders findById(String ordersId) throws Exception;
}
