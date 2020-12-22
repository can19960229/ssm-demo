package candy.ssm.dao;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/16 19:35
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
