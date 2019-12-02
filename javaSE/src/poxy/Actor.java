package poxy;

/**
 * ClassName : Actor
 * package : poxy
 * Description :TODO
 *
 * @date :2019/7/7 18:12
 * @Author :xiaoshuai
 */
public class Actor implements IActor{

    /**
     * 基本的演出
     * @param money
     */
    public void basicAct(float money) {
        System.out.println("拿到钱开始基本的表演:"+money);
    }

    /**
     * 危险的演出
     * @param money
     */
    public void dangerAct(float money) {
        System.out.println("拿到钱开始危险的表演:"+money);
    }


}
