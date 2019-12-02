package io;

import java.io.*;

/**
 * ClassName : CopyDirTest
 * package : io
 *
 * @date :2019/6/2 22:19
 * @Author :xiaoshuai
 */
public class CopyDirTest {

    public static void main(String[] args) throws IOException{
        File srcford = new File("d:\\demo");
        File destford = new File("e:\\test");
        if (!destford.exists()){
            destford.mkdir();
        }

        File[] files = srcford.listFiles();
        for (File file:files){
            String name = file.getName();
            File newfile = new File(destford,name);
            copyfile(file,newfile);
        }


    }

    public static void copyfile(File file,File newfile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newfile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
