package com.cn.xyx.service.Impl;

import com.cn.xyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

/**
 * AT3Q0081
 *
 * @Description : 输出日志
 * @Author : 谢宇翔
 * @Date: 2021/1/20 10:48
 */
@Service
public class UserJournal implements UserService {

    @Autowired(required=false) 
    public UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    //日志方法
    public void  log(String msg){
        System.out.println("[日志方法] 是使用代理模式 添加日志的方法 不改变原有代码的情况下加日志"+msg+"方法");
    }


    @Override
    public void add() {
        log("aaa");
     userService.add();
    }

    @Override
    public String query() {
        return userService.query();
    }

    @Override
    public String updata() {
        return userService.updata();
    }

    @Override
    public String delete() {
        return userService.delete();
    }
}
