package com.cn.xyx.entity;

/**
 * AT3Q0081
 *
 * @Description :
 * @Author : 谢宇翔
 * @Date: 2021/1/21 22:21
 */

public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
