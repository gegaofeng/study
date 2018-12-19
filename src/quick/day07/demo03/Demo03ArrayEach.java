package quick.day07.demo03;

import java.util.ArrayList;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-16 16:51
 */
public class Demo03ArrayEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAAA");
        list.add("bbb");
        list.add("ccc");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
