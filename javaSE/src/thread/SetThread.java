package thread;

/**
 * ClassName : SetThread
 * package : thread
 *
 * @date :2019/6/8 18:03
 * @Author :xiaoshuai
 */
public class SetThread implements Runnable {

    private Student s;
    private int x = 0;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (s) {
                if (s.flag) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x % 2 == 0) {
                    s.name = "林青霞";
                    s.age = 18;
                } else {
                    s.name = "林允儿";
                    s.age = 17;
                }

                x++;
                s.flag = true;
                s.notify();
            }
        }

    }
}
