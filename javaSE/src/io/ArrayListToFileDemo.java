package io;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName : ArrayListToFileDemo
 * package : io
 *
 * @date :2019/6/2 22:07
 * @Author :xiaoshuai
 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        //create list
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");

        //创建流用来写文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("c.txt"));
        Iterator it = list.iterator();
        while (it.hasNext()){
            bw.write(it.next().toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();


    }

}
