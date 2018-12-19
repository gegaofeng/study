package quick.day10.demo03;

import java.util.ArrayList;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 22:16
 */
public class demo07StreamParallel {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            list1.add(i);
        }
//        list1.stream().forEach(System.out::println);
        list1.parallelStream().forEach(System.out::println);
    }
}
