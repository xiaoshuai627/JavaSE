package collection.chap1;

/**
 * ClassName : GenricInter
 * package : collection.chap1
 *
 * @date :2019/5/26 17:37
 * @Author :xiaoshuai
 */
public class GenricInter<String> implements Inter<String> {
    @Override
    public void show(String str) {
        System.out.println(str);
    }
}
