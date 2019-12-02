package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * ClassName : ReflaceDemo
 * package : reflect
 *
 * @date :2019/6/9 22:04
 * @Author :xiaoshuai
 */
public class ReflaceDemo {

    public static void main(String[] args) throws Exception {

        Class c3 = Class.forName("reflect.Student");

        //通过反射获取类的构造方法
        /*Constructor[] con = c3.getDeclaredConstructors();
        for (Constructor constructor : con) {
            System.out.println(constructor);
        }*/

        /*Field[] fields = c3.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

        Constructor c = c3.getDeclaredConstructor(String.class);
        Object object = c.newInstance("xiaoming");
        System.out.println(object);

        Field field = c3.getDeclaredField("name");
        field.setAccessible(true);
        field.set(object,"lili");
        System.out.println(object);


    }


}
