package exception;

/**
 * ClassName : Teacher
 * package : exception
 *
 * @date :2019/5/30 22:39
 * @Author :xiaoshuai
 */
public class Teacher {
    public void check(int core) throws MyExcetion {
        if (core<0 || core>100){
            throw new MyExcetion("请输入合法的分数值：0-100");
        } else{
            System.out.println("分数合法！");
        }
    }

}
