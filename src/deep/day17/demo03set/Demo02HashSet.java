package deep.day17.demo03set;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: study
 * @description: HashSet唯一性，底层数据结构：数组【链表】
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-25 20:10
 */
public class Demo02HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //添加数据
        set.add("1");
        set.add("aa");
        set.add("c");
        set.add("bb");
        set.add("d");
        //遍历
        for (String str : set) {
            System.out.println(str);
        }
    }
}
