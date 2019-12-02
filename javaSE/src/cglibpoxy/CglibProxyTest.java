package cglibpoxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName : CglibProxyTest
 * package : poxy
 * Description :TODO
 *
 * @date :2019/7/7 18:21
 * @Author :xiaoshuai
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        final Actor actor = new Actor();

        /**
         * 动态代理：
         *  作用：不改变源码的基础上，对已有的方法增强。
         *  分类：
         *      1、基于接口的动态代理
         *          要求：被代理对象至少实现一个接口
         *          提供者：JDK官方
         *      创建代理对象的方法：
         *      newProxyInstance(Classloader,Class[],invocationHandler);
         *        Classloader：类加载器(加载被代理对象)
         *        Class[]:字节码数组，被代理对象实现的接口
         *        invocationHandler：实现如何增强代理，它是一个接口，就是基于增强代码的实现类。
         *       返回对象是接口的实例对象
         *     2、基于子类的动态代理
         *          要求：被代理子类不能是最终类。不能被final修饰
         *
         */



    }
}
