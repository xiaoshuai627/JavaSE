package annotation;

import java.lang.reflect.Method;

/**
 * ClassName : CglibProxyTest
 * package : annotation
 * Description :读取测试类注解的main函数
 *
 * @date :2019/7/7 17:05
 * @Author :xiaoshuai
 */
public class Client {

    public static void main(String[] args) throws Exception{
        //1、得到测试类的字节码
        Class c = MyAnnotationTest.class;
        //2、获取该类字节码的所有方法
        Method[] methods =c.getMethods();

        //遍历方法的数组
        for (Method method:methods) {
            Boolean b = method.isAnnotationPresent(MyTest.class);
            if (b){
                //判断方法上面是否有注解
                System.out.println(method.getName()+"====="+b);
                //通过反射调用注解方法
                method.invoke(c.newInstance(),null);
            }
        }

    }
}
