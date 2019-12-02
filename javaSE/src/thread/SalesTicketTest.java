package thread;

/**
 * ClassName : SalesTicketTest
 * package : thread
 *
 * @date :2019/6/8 11:17
 * @Author :xiaoshuai
 */
public class SalesTicketTest {

    public static void main(String[] args) {


        SaleTicket tick = new SaleTicket();

        Thread t1 = new Thread(tick,"窗口1");
        Thread t2 = new Thread(tick,"窗口2");
        Thread t3 = new Thread(tick,"窗口3");

        t1.start();
        t2.start();
        t3.start();





    }

}
