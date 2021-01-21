package com.cn.xyx.aop;

import com.cn.xyx.service.Impl.UserServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * AT3Q0081
 *
 * @Description : 使用注解 面向切面
 * @Author : 谢宇翔
 * @Date: 2021/1/20 21:18
 */

@Aspect
public class AopMain2 {

    //    @Before("execution(* com.cn.xyx.service.Impl.UserServiceImpl.*(..))")
//    public void before(){
//        System.out.println("-----使用注解实现切面-------");
//    }
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Pointcut("execution(* com.cn.xyx.service.Impl.UserServiceImpl.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint jp) {
        System.out.println("*********************"+jp);
        log.info("调用" + jp.getTarget() + "的" + jp.getSignature().getName()
                + "方法。方法入参：" + Arrays.toString(jp.getArgs()));
    }

    @AfterReturning(pointcut = "pointcut()", returning = "returnValue")
    public void afterReturning(JoinPoint jp, Object returnValue) {
        log.info("调用" + jp.getTarget() + "的" + jp.getSignature().getName()
                + "方法。方法返回值：" + returnValue);
    }
}
