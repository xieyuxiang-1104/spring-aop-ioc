package com.cn.xyx;

import com.cn.xyx.entity.Student;
import com.cn.xyx.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AT3Q0081
 *
 * @Description : di依赖注入
 * @Author : 谢宇翔
 * @Date: 2021/1/21 21:50
 */

public class DiMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-bens.xml");
        Student a=context.getBean("student", Student.class);
        System.out.println(a);

    }
}
