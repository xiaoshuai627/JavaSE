package io;

import java.io.*;

/**
 * ClassName : CopyFile
 * package : io
 *
 * @date :2019/6/2 16:52
 * @Author :xiaoshuai
 */
public class CopyFile {
    public static void main(String[] args) throws IOException{
        String srcpath = "io.txt";
        String destpath = "b.txt";
//        method1(srcpath,destpath);
//        method2(srcpath,destpath);
//        method3(srcpath,destpath);
        method4(srcpath,destpath);

    }

    //基本字节流一次读取一个字符
    public static void method1(String srcpath, String destpath) throws IOException {
        FileReader fr = new FileReader(srcpath);
        FileWriter fw = new FileWriter(destpath);

        int chr = 0;
        while ((chr = fr.read()) != -1) {
            fw.write(chr);
        }
        fw.close();
        fr.close();
    }

    //基本字节流一次读取一个字符数组
    public static void method2(String srcpath, String destpath) throws IOException {
        FileReader fr = new FileReader(srcpath);
        FileWriter fw = new FileWriter(destpath);

        char[] chr = new char[1024];
        int len = 0;
        while ((len = fr.read(chr)) != -1) {
            fw.write(chr, 0, len);
        }
        fw.close();
        fr.close();
    }

    //字符缓冲流一次读取一个字符数组
    public static void method3(String srcpath, String destpath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcpath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destpath));

        char[] chr = new char[1024];
        int len = 0;
        while ((len = br.read(chr)) != -1) {
            bw.write(chr, 0, len);
        }
        bw.close();
        br.close();
    }

    //字符缓冲流一次读取一行
    public static void method4(String srcpath, String destpath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcpath));
        BufferedWriter bw = new BufferedWriter(new FileWriter(destpath));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }

}
