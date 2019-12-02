package io;


import java.io.File;
import java.io.IOException;

/**
 * ClassName : FileTest
 * package : io
 *
 * @date :2019/5/30 23:04
 * @Author :xiaoshuai
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        //定义文件的路径
        String path = "e:\\Resource\\电影";
        //创建文件的抽象对象
        File file = new File(path);
        //遍历
        FilesTool.getAllFile(file);


    }
}
