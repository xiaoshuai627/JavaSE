package jutest;


import exception.MyExcetion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * ClassName : Test2
 * package : jutest
 * Description :TODO
 *
 * @date :2019/6/28 10:30
 * @Author :xiaoshuai
 */
public class Test2 {
    
    @Before
    public void begin() {
        System.out.println("test start!");
    }

    @Test
    public void method1() {
        assertEquals(1, 1);
        System.out.println("method1");
    }

    @Test(timeout = 1)
    public void method2() {
        System.out.println("timeout");
    }

    //assert 测试数组
    @Test
    public void method3() {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,3};
        assertArrayEquals(arr1,arr2);
        assertEquals("不相等",arr1,arr2);

    }

    @Test(expected = MyExcetion.class)
    public void method4() {
        try {
            throw new MyExcetion();
        } catch (MyExcetion myExcetion) {
            myExcetion.printStackTrace();
        }
    }


}
