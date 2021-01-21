package com.cn.xyx;

import com.cn.xyx.service.Impl.UserJournal;
import com.cn.xyx.service.Impl.UserServiceImpl;
import com.cn.xyx.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AT3Q0081
 *
 * @Description :
 * @Author : 谢宇翔
 * @Date: 2021/1/20 10:40
 */
//@SpringBootApplication
public class AopMain {
    public static void main(String[] args){

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的接口
        UserService userService=context.getBean("userService",UserService.class);
        userService.add();

    }
}
