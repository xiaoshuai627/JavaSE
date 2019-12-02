package collection;

import pojo.Student;

import java.util.ArrayList;


/**
 * ClassName : ArrayListTest
 * package : collection
 *
 * @date :2019/5/20 22:41
 * @Author :xiaoshuai
 */
public class ArrayListTest {
    public static void main (String [] args) {
        ArrayList c = new ArrayList();
        Student s = new Student("小米",20);
        Student s1 = new Student("小明",18);
        Student s3 = new Student("小红",18);
        Student s4 = new Student("丽丽",15);
        Student s5 = new Student("丽丽2",25);
        c.add(s);
        c.add(s1);
        c.add(s3);
        c.add(1,s4);
        c.set(2,s5);
        System.out.println("打印集合中的第二个元素："+c.get(2));
        //System.out.println(c.remove(s1));
        System.out.println(c.remove(3));
        /*Iterator iterator1 = c.iterator();
        while (iterator1.hasNext()) {
            Student stduent = (Student) iterator1.next();
            System.out.println(stduent.getName()+"---"+stduent.getAge());
        }*/


    }
}
