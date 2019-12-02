package annotation;

/**
 * ClassName : CustomerServerimp
 * package : annotation
 * Description :TODO
 *
 * @date :2019/7/7 16:59
 * @Author :xiaoshuai
 */
public class CustomerServerimp implements ICustomerServeice {

    @Override
    public void saveCustomer() {
        System.out.println("服务层调用数据层成功！");
    }
}
