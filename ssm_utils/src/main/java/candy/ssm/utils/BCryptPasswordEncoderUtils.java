package candy.ssm.utils;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/18 15:19
 * version 1.0
 * Description: 测试
 */

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 密码加密方法
 */
public class BCryptPasswordEncoderUtils {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static String encodePassword(String password) {
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password = "456";
        System.out.println(encodePassword(password));

    }
}
