package candy.ssm.service;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/16 10:35
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Orders;

import java.util.List;

/**
 *
 */
public interface IOrdersService {

    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
