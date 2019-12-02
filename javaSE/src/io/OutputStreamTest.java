package io;

import java.io.*;

/**
 * ClassName : OutputStreamTest
 * package : io
 *
 * @date :2019/6/2 15:50
 * @Author :xiaoshuai
 */
public class OutputStreamTest {
    public static void main(String[] args) {

        //创建字节输出流，写一个文件
        OutputStream ot = null;
        try {
            ot = new FileOutputStream("io.txt");
            byte[] str = "nihao".getBytes();
            ot.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ot != null) {
                try {
                    ot.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
