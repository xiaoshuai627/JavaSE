package datasourcepool;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ClassName : JdbcUtils
 * package : datasourcepool
 * Description :TODO
 *
 * @date :2019/7/8 21:18
 * @Author :xiaoshuai
 */
public class JdbcUtils {


    public static Connection getConnection() throws Exception{
        // 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 获取连接
        String url = "jdbc:mysql://localhost:3306/mybatis?serverTimezone=UTC&useSSL=false";
        String user = "root";
        String passwd = "root627";
        return DriverManager.getConnection(url, user, passwd);

    }
}
