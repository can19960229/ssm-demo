package candy.ssm.dao;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/15 10:17
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
public interface IProductDao {



    //根据id查询产品
    @Select("select * from product where id = #{id}")
    public Product findById(String id) throws Exception;


    //查询所有商品信息
    @Select("select * from product")
    public List<Product> findAll() throws Exception;


    @Insert("insert into product(id,productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{id},#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);

}
