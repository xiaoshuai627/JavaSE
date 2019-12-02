package io;

import java.io.*;

/**
 * ClassName : InstreamTest
 * package : io
 *
 * @date :2019/6/2 16:36
 * @Author :xiaoshuai
 */
public class InstreamTest {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream("io.txt");
            int by = 0;
            while ((by = in.read()) != -1) {
                System.out.println((char) by);
                by = in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
