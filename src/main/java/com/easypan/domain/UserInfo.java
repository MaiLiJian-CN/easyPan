package com.easypan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

// 在编译期间生成user类的全参构造方法
@AllArgsConstructor
// 在编译期间生成user类的无参构造方法
@NoArgsConstructor
// 在编译期间生成封装属性的setter、getter方法，并重写了toString和equals、hashCode方法
@Data
public class UserInfo {
    private String user_id;
    private String nick_name;
    private String email;
    private String qq_open_id;
    private String qq_avatar;
    private String password;
    private Date join_time;
    private Date last_login_time;
    private int status;
    private int user_space;
    private int total_space;
}
