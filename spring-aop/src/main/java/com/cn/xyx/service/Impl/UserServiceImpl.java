package com.cn.xyx.service.Impl;

import com.cn.xyx.service.UserService;
import org.springframework.stereotype.Component;

/**
 * AT3Q0081
 *
 * @Description :
 * @Author : 谢宇翔
 * @Date: 2021/1/20 10:42
 */

public class UserServiceImpl implements UserService {


    @Override
    public void add() {
        System.out.println( "增加");
    }

    @Override
    public String query() {
        return "查询";
    }

    @Override
    public String updata() {
        return "更新";
    }

    @Override
    public String delete() {
        return "删除";
    }
}
