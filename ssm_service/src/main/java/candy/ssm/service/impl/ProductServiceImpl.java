package candy.ssm.service.impl;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/15 10:21
 * version 1.0
 * Description: 测试
 */

import candy.ssm.dao.IProductDao;
import candy.ssm.domain.Product;
import candy.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService{

    @Autowired
    private IProductDao productDao;

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public List<Product> findAll() throws Exception{
        return productDao.findAll();
    }
}
