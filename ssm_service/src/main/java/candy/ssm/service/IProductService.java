package candy.ssm.service;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/15 10:20
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Product;

import java.util.List;

/**
 *
 */
public interface IProductService {


    List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
