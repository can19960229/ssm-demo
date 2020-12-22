package candy.ssm.service.impl;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/16 10:36
 * version 1.0
 * Description: 测试
 */

import candy.ssm.dao.IOrdersDao;
import candy.ssm.domain.Orders;
import candy.ssm.service.IOrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page,int size) throws Exception {

        //参数pageNum是页码值， 参数pageSize代表是每页显示条数
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}
