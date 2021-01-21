package com.cn.xyx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * AT3Q0081
 *
 * @Description : 动态代理类
 * @Author : 谢宇翔
 * @Date: 2021/1/20 20:51
 */
//自动生成类
public class ProxylmvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;
    private Object proxy;
    private Method method;
    private Object[] args;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理实例对象并返回结果
  @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(target,args);
        return  result;
    }
}
