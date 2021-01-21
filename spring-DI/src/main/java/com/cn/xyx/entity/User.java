package com.cn.xyx.entity;

/**
 * AT3Q0081
 *
 * @Description :
 * @Author : 谢宇翔
 * @Date: 2021/1/21 21:51
 */

public class User {
    private int id;
    private String name;
    private int age;
    private String pwd;

    public User() {
    }

    public User(int id, String name, int age, String pwd) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.pwd = pwd;
        System.out.println("User的全参构造");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
