package quick.day10.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 22:11
 */
public class Demo06StreamForEach {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(95);
        list1.add(92);
        list1.add(25);

        Stream<Integer> streamA = list1.stream();
//        streamA.forEach(a-> System.out.println(a));

        streamA.forEach(System.out::println);

    }
}
