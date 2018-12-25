package deep.day17.demo03set;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: study
 * @description:set对象
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-25 20:06
 */
public class Demo01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("c");
        set.add("b");
        set.add("d");
        for (String str : set) {
            System.out.println(str);
        }
    }
}
