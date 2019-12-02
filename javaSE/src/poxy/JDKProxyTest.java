package poxy;

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
public class JDKProxyTest {
    public static void main(String[] args) {
        final Actor actor = new Actor();

        /**
         * 动态代理：
         *  作用：不改变源码的基础上，对已有的方法增强。
         *  分类：
         *      基于接口的动态代理
         *          要求：被代理对象至少实现一个接口
         *          提供者：JDK官方
         *      创建代理对象的方法：
         *      newProxyInstance(Classloader,Class[],invocationHandler);
         *        Classloader：类加载器(加载被代理对象)
         *        Class[]:字节码数组，被代理对象实现的接口
         *        invocationHandler：实现如何增强代理，它是一个接口，就是基于增强代码的实现类。
         *       返回对象是接口的实例对象
         */

        IActor proxyInstance = (IActor) Proxy.newProxyInstance(actor.getClass().getClassLoader(),
                actor.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 执行被代理对象的任何方法都会经过该方法，该方法有拦截功能
                     * @param proxy：代理对象的引用，不一定每次都有
                     * @param method：当前的执行方法
                     * @param args：当前方法执行所需要的参数
                     */

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object rtVlaue = null;
                        //1、获取执行方法的参数来进行逻辑判断
                        Float money = (Float) args[0];
                        if ("basicAct".equals(method.getName())) {
                            if (money > 10000) {
                                //执行方法
                                rtVlaue = method.invoke(actor, money/2);
                            }
                        }
                        if ("dangerAct".equals(method.getName())) {
                            if (money > 50000) {
                                rtVlaue = method.invoke(actor,money/2);
                            }
                        }
                        return rtVlaue;
                    }
                });


        proxyInstance.basicAct(20000);
        proxyInstance.dangerAct(60000);
    }
}
