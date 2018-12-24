package deep.day16.demo03news;

import java.util.Arrays;
import java.util.List;

/**
 * @program: study
 * @description: asList()方法
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:34
 */
public class Demo04AsList {
    public static void main(String[] args) {
        String[] strArray = {"a", "s", "d", "f"};

        List<String> list = Arrays.asList(strArray);
        //改变后集合长度不能改变,无法进行如下操作
//        list.add("a");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
