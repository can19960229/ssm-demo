package candy.ssm.domain;/**
 * Copyright (C), 2019-2020
 * author  candy_chen
 * date   2020/12/16 10:27
 * version 1.0
 * Description: 测试
 */

/**
 * 会员类
 */
public class Member {
    private String id;
    private String name;
    private String nickname;
    private String phoneNum;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
