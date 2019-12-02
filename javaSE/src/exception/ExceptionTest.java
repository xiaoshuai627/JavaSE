package exception;

import java.util.Scanner;

/**
 * ClassName : ExceptionTest
 * package : exception
 *
 * @date :2019/5/30 22:27
 * @Author :xiaoshuai
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input your score!");
        int score = s.nextInt();
        Teacher t = new Teacher();
        try {
            t.check(score);
        } catch (MyExcetion myExcetion) {
            myExcetion.printStackTrace();
        }
        System.out.println("over!");
    }
}
