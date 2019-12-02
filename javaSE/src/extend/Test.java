package extend;

/**
 * ClassName : Test
 * package : extend
 * Description :TODO
 *
 * @date :2019/8/11 12:50
 * @Author :xiaoshuai
 */
public class Test {

    public static void main(String[] args) {
        Animal dog = new Dog();
        
        dog.name ="泰迪";

        
        dog.run();
        dog.eat();
        System.out.println(dog.name);
    }
}
