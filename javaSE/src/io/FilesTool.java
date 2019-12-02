package io;

import java.io.File;

/**
 * ClassName : FilesTool
 * package : io
 *
 * @date :2019/5/31 15:06
 * @Author :xiaoshuai
 */
public class FilesTool {
    public static void getAllFile(File srcFolder) {
        File[] files = srcFolder.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("filename:" + file.getName() + "-----" + "path:" + file.getPath());
            } else {
                getAllFile(file);
            }
        }
    }
}
