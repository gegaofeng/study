package day07.demo03;

import java.util.ArrayList;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-16 16:36
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println(list1);
        list1.add("AAA");
        list1.add("BBB");
        list1.add("ccc");
        System.out.println(list1);
        System.out.println("======");
        String name = list1.get(1);
        System.out.println(name);
        System.out.println("=====");
        System.out.println("吉和长度" + list1.size());
    }
}
