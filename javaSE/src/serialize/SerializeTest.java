package serialize;

import java.io.*;

/**
 * ClassName : SerializeTest
 * package : serialize
 * Description :TODO
 *
 * @date :2019/6/21 16:48
 * @Author :xiaoshuai
 */
public class SerializeTest {


    public static void main(String[] args) {

        User user = new User("小米", 20);

        //把对象写到文件中
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("chemo.txt"));
            oos.writeObject(user);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //从文件中读取对象
        ObjectInputStream ooi = null;

        try {
            ooi = new ObjectInputStream(new FileInputStream("chemo.txt"));
            User user1 = (User) ooi.readObject();
            System.out.println(user1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
