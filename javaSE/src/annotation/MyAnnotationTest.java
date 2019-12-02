package annotation;

/**
 * ClassName : MyAnnotationTest
 * package : annotation
 * Description :TODO
 *
 * @date :2019/7/7 16:57
 * @Author :xiaoshuai
 */
public class MyAnnotationTest {

    @MyTest
    public void saveCustomerTest() {
        ICustomerServeice sc = new CustomerServerimp();
        sc.saveCustomer();
    }


}
