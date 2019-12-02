package extend;

/**
 * ClassName : StaticTest
 * package : extend
 * Description :TODO
 *
 * @date :2019/6/19 17:33
 * @Author :xiaoshuai
 */
public class StaticTest {

    public static void main(String[] args) {

        D.method1();
        D d = new D();
        d.method();
    }
}

class D{
    static {
        i=2;
        System.out.println("D:静态代码块");
    }

    static final int i;

    int j;
    static void method1() {
        System.out.println(i);
        System.out.println(new D().j);

    }

    void method() {
        System.out.println(i);

    }

    static void method2() {
//        System.out.println(j);

    }


}
