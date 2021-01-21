package com.cn.xyx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * AT3Q0081
 *
 * @Description : 注入测试
 * @Author : 谢宇翔
 * @Date: 2021/1/21 22:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String, String> card;
    private Set<String> game;
    private String wife;
    private Properties info;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", game=" + game +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}

