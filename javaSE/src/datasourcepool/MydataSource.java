package datasourcepool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName : MydataSource
 * package : datasourcepool
 * Description :自定义连接池
 *
 * @date :2019/7/8 21:07
 * @Author :xiaoshuai
 */
public class MydataSource {

    //定义连接池对象
    private static List<Connection> pool = Collections.synchronizedList(new ArrayList<Connection>());

    //使用静态代码块给池中加入连接对象
    static {
        for (int i =0;i<10;i++) {
            try {
                Connection con = JdbcUtils.getConnection();
                pool.add(con);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 获取一个连接,不是用动态代理，关闭连接，连接池中会少一个连接
     * @return
     */
    public static Connection getConnection() {
        return pool.remove(0);
    }


    /**
     * 使用代理对象来获取连接连接池对象
     * @return
     * @throws Exception
     */

    public static Connection getProxyConnection() throws Exception{
        //获取连接对象
        Connection conn = pool.remove(0);
        //创建连接对象代理
        Connection proxyConn=(Connection) Proxy.newProxyInstance(conn.getClass().getClassLoader(),
                conn.getClass().getInterfaces(),
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object rtValue = null;

                //判断对象调用的方法
                if ("close".equals(method.getName())){
                    //当调用方法是close关闭数据连接时，需要将连接回收到数据库连接池中
                    pool.add(conn);
                }
                else {
                    rtValue=method.invoke(conn,args);
                }
                return rtValue;
            }
        });

        return proxyConn;
    }

    //获取pool的大小
    public static int getPoolSize() {
        return pool.size();
    }

}
