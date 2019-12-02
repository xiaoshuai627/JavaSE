package thread;

/**
 * ClassName : SaleTicket
 * package : thread
 *
 * @date :2019/6/8 11:13
 * @Author :xiaoshuai
 */
public class SaleTicket implements Runnable {

    private int tick = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tick > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (tick--) + "张票！");
                }
            }
        }
    }
}
