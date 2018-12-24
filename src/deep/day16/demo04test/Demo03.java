package deep.day16.demo04test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: study
 * @description: 键盘录入数据判断最大值
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:55
 */
public class Demo03 {
    public static void main(String[] args) {
        //键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //录入个数未知，使用集合记录
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true) {
            System.out.println("请输入数字，0表示录入结束");
            int num = scanner.nextInt();
            //录入0结束录入
            if (num != 0) {
                arrayList.add(num);
            } else {
                break;
            }
        }
        //集合转数组
        Integer[] integers = new Integer[arrayList.size()];
        Integer[] integers1 = arrayList.toArray(integers);

        System.out.println(integers1);
        System.out.println(integers);
        arrayList.toArray(integers);
        //排序输出
        Arrays.sort(integers);
        System.out.println(integers[integers.length - 1]);
    }
}
