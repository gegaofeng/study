package deep.day15.demo02collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @program: study
 * @description:List解析
 * @author: Feng
 * @create: 2018-12-23 22:04
 */
public class Demo04List {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("c");
        list.add("d");
//    list.add("e");
        //只能添加下一个索引的元素
        list.add(3, "f");
        list.add(4, "g");
        System.out.println("list:" + list);
        //迭代器迭代是不能修改集合，否则会报错
//        Iterator it=list.iterator();
//        while (it.hasNext()){
//            String s=(String)it.next();
//            if ("a".equals(s)){
//                list.add("haha");
//            }
//        }
        //解决方法，使用迭代器修改集合
        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            String s = (String) lit.next();
            if ("a".equals(s)) {
                //添加元素在迭代器所指元素后
                lit.add("haha");
            }
        }
        System.out.println("list:" + list);
        System.out.println("集合遍历=====");
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            if ("a".equals(s)) {
                list.add("qqqq");
            }
        }
        System.out.println("list:" + list);
    }
}
