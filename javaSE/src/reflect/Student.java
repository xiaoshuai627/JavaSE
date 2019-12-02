package reflect;

/**
 * ClassName : Student
 * package : pojo
 *
 * @date :2019/5/24 22:14
 * @Author :xiaoshuai
 */


public class Student implements Comparable<Student> {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student s) {

        int num1 = this.age - s.getAge();
        int num2 = num1 == 0 ? this.name.compareTo(s.getName()) : num1;
        return num2;
    }
}
