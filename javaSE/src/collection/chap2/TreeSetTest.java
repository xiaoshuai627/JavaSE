package collection.chap2;

import pojo.Student;

import java.util.TreeSet;

/**
 * ClassName : TreeSetTest
 * package : collection.chap2
 *
 * @date :2019/5/27 21:37
 * @Author :xiaoshuai
 */
public class TreeSetTest {
    public static void main(String[] agrs) {
        //创建一个TreeSet集合
        TreeSet<Student> ts = new TreeSet<Student>();
        //创建学生对象
        Student s1 = new Student("xiaomi",10);
        Student s2 = new Student("xiaoming",11);
        Student s3 = new Student("xiaohong",8);
        Student s4 = new Student("xiaobai",10);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student student:ts){
            System.out.println(student);
        }

    }
}
