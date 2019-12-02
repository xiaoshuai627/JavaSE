package thread;

/**
 * ClassName : GetThread
 * package : thread
 *
 * @date :2019/6/8 18:05
 * @Author :xiaoshuai
 */
public class GetThread implements Runnable {

    private Student s;


    public GetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (s) {
                if (!s.flag) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(s.name + "----" + s.age);
                s.flag = false;
                s.notify();
            }
        }
    }
}
