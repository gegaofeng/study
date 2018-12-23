package deep.day15.demo02collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: study
 * @description: 集合对象
 * @author: Feng
 * @create: 2018-12-23 20:52
 */
public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        ((ArrayList<String>) c1).add("a1");
        ((ArrayList<String>) c1).add("a2");
        ((ArrayList<String>) c1).add("a3");
//        ((ArrayList<String>) c1).add("a4");
        //c2
        ((ArrayList<String>) c2).add("a1");
        ((ArrayList<String>) c2).add("a2");
        ((ArrayList<String>) c2).add("a3");
        ((ArrayList<String>) c2).add("a6");
        ((ArrayList<String>) c2).add("a7");
        //retainAll()返回值表述集合是否改变
        System.out.println(c1.retainAll(c2));
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);

    }
}
