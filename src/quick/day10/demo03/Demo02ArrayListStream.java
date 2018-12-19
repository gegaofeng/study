package quick.day10.demo03;

import java.util.ArrayList;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 21:42
 */
public class Demo02ArrayListStream {
    public static void main(String[] args) {
        ArrayList<String> recordList = new ArrayList<>();
        recordList.add("aaa,95");
        recordList.add("sss,93");
        recordList.add("www,82");
        //Stream
        recordList.stream().map(s -> s.split(",")[1]).map(Integer::parseInt).filter(n -> n > 90).forEach(System.out::println);
    }
}
