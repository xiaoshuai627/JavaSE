package array;

/**
 * ClassName : SelectTest
 * package : array
 * Description :TODO
 *
 * @date :2019/8/15 20:22
 * @Author :xiaoshuai
 */
public class SelectTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, -5, 4, 9, 8};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        //冒泡排序升序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int y = 0; y < arr.length - 1 - i; y++) {
                if (arr[y] > arr[y + 1]) {
                   int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }

        //选择排序升序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }


        System.out.println("=======");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


    //--------------选择排序法
    class Select {
        public void sort(int arr[]) {
            //中间值
            int temp = 0;

            //外循环:我认为最小的数,从0~长度-1
            for (int j = 0; j < arr.length - 1; j++) {
                //最小值:假设第一个数就是最小的
                int min = arr[j];
                //记录最小数的下标的
                int minIndex = j;

                //内循环:拿我认为的最小的数和后面的数一个个进行比较
                for (int k = j + 1; k < arr.length; k++) {
                    //找到最小值
                    if (min > arr[k]) {
                        //修改最小
                        min = arr[k];
                        minIndex = k;
                    }
                }
                //当退出内层循环就找到这次的最小值
                //交换位置
                temp = arr[j];
                arr[j] = arr[minIndex];
                arr[minIndex] = temp;
            }
            //输出结果
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "   ");
            }

        }
    }
}