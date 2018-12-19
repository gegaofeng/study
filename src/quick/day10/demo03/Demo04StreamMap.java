package quick.day10.demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 22:00
 */
public class Demo04StreamMap {
    public static void main(String[] args) {
        ArrayList<String> recordList = new ArrayList<>();
        recordList.add("95");
        recordList.add("93");
        recordList.add("82");

        Stream<Integer> streamA = recordList.stream().map((String str) -> {
            int num = Integer.parseInt(str);
            return num;
        });

        Stream<Integer> streamB = recordList.stream().map(str -> {
            return Integer.parseInt(str);
        });

        Stream<Integer> streamC = recordList.stream().map(
                Integer::parseInt
        );
    }

}
