package collection;

import pojo.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName : MapTest
 * package : collection
 *
 * @date :2019/5/27 23:06
 * @Author :xiaoshuai
 */
public class MapTest {
    public static void main(String[] agrs){
        //创建HashMap
        HashMap<Integer,Student> hashMap = new HashMap<Integer, Student>();
        Student s1 = new Student("小明",16);
        Student s2 = new Student("小红",14);
        System.out.println(hashMap.put(1,s1));
        System.out.println(hashMap.put(2,s2));
        System.out.println("放重复对象："+hashMap.put(1,s1));
        
        System.out.println("hash.size:"+hashMap.size());

        //遍历键值
        Set<Integer> integers = hashMap.keySet();
        for (Integer i :integers) {
            System.out.println(i);
        }

        //遍历value值
        Collection<Student> values = hashMap.values();
        for (Student s :values) {
            System.out.println(s);
        }

        System.out.println("hashmap to_string:"+hashMap);

        //获取键值映射
        Set<Map.Entry<Integer, Student>> entries = hashMap.entrySet();

        //遍历键值映射的set集合元素
        for (Map.Entry<Integer,Student> entry :entries){
            Integer key = entry.getKey();
            Student s = entry.getValue();
            System.out.println(key+"------"+s);
        }
    }
}
