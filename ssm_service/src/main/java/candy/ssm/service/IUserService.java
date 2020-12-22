package candy.ssm.service;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/17 19:55
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 *
 */
public interface IUserService extends UserDetailsService {


    List<UserInfo> findAll() throws  Exception;

    void save(UserInfo userInfo) throws  Exception;

    UserInfo findById(String id)throws  Exception;
}
