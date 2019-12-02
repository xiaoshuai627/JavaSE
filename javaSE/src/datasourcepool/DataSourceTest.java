package datasourcepool;

import org.junit.Test;

import java.sql.Connection;

/**
 * ClassName : DataSourceTest
 * package : datasourcepool
 * Description :TODO
 *
 * @date :2019/7/8 21:40
 * @Author :xiaoshuai
 */
public class DataSourceTest {


    //不是用代理从连接池中获取对象
    @Test
    public void method1() throws Exception {

        System.out.println("获取连接之前池的大小：" + MydataSource.getPoolSize());
        Connection connection = MydataSource.getConnection();
        System.out.println(connection);
        connection.close();
        System.out.println("获取连接池之后池的大小：" + MydataSource.getPoolSize());

    }


    //使用代理从连接池中获取连接对象
    @Test
    public void method2() throws Exception {
        int size = MydataSource.getPoolSize();

        System.out.println("获取连接之前池的大小：" + size);
        for (int i = 0; i < size; i++) {
            Connection connection = MydataSource.getProxyConnection();
            System.out.println(connection);
            connection.close();
        }
        System.out.println("获取连接池之后池的大小：" + MydataSource.getPoolSize());
    }
}
