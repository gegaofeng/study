package quick.day10.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 22:08
 */
public class Demo05StreamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(95);
        list1.add(92);
        list1.add(25);


        Stream<Integer> stream1 = list1.stream().filter(num -> {
            boolean result = num > 90;
            return result;
        });
        Stream<Integer> stream2 = list1.stream().filter(num -> num > 90);
    }
}
