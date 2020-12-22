package candy.ssm.dao;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/16 19:31
 * version 1.0
 * Description: 测试
 */

import candy.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 *
 */
public interface IMemberDao {

    @Select("select * from member where id=#{id}")
    public Member findById(String id) throws Exception;
}
