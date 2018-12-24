package deep.day16.demo03news;

import java.util.List;

/**
 * @program: study
 * @description:JDK5新特性，增强for,底层实现就是迭代器
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:16
 */
public class Demo01 {
    public static void main(String[] args) {
        //int数组
        int[] arr = {1, 2, 3, 4, 56, 6};
        //原始for
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("增强for====");
        //增强for
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println("=====");
        //弊端
        List<String> list = null;
        //list为null，空指针异常
        //先判断null
        if (list != null) {
            for (String s : list) {
                System.out.println(s);
            }
        }

    }
}
