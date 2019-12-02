package thread;

/**
 * ClassName : ExtendThread
 * package : thread
 *
 * @date :2019/6/7 11:02
 * @Author :xiaoshuai
 */
public class ExtendThread extends Thread {
    public ExtendThread() {
    }

    public ExtendThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
            Thread.yield();
        }

    }
}
