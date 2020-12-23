package candy.ssm.service;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/23 15:54
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.SysLog;

import java.util.List;

/**
 *
 */
public interface ISysLogService {
    public void save(SysLog sysLog) throws Exception;

    List<SysLog> findAll() throws Exception;

}
