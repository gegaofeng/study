package quick.day10.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 21:55
 */
public class Demo03GetStream {
    public static void main(String[] args) {
        //根据集合获取流
        ArrayList<String> recordList = new ArrayList<>();
        recordList.add("aaa,95");
        recordList.add("sss,93");
        recordList.add("www,82");

        Stream<String> streamA = recordList.stream();

        //根据数组获取流
        String[] arr = {"aaa", "bbb", "ccc"};
        Stream<String> streamB = Stream.of(arr);
    }
}
