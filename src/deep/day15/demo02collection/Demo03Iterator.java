package deep.day15.demo02collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: study
 * @description: Iterator()方法
 * @author: Feng
 * @create: 2018-12-23 21:29
 */
public class Demo03Iterator {
    public static void main(String[] args) {
        Collection<String> c1 = new ArrayList<>();

        ((ArrayList<String>) c1).add("a1");
        ((ArrayList<String>) c1).add("a2");
        ((ArrayList<String>) c1).add("a3");
        Iterator i = c1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
        //for循环中Iterator对象为局部对象，用完即销毁，效率更高
        System.out.println("if======");
        for (Iterator k = c1.iterator(); k.hasNext(); ) {
            System.out.println(k.next());
        }
    }
}
