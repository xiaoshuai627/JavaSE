package collection.chap1;

/**
 * ClassName : GenricClass
 * package : collection.chap1
 *
 * @date :2019/5/26 17:16
 * @Author :xiaoshuai
 */
public class GenricClass <T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
