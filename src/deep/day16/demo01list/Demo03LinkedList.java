package deep.day16.demo01list;

import java.util.LinkedList;

/**
 * @program: study
 * @description: LinkedLIst()
 * @author: Feng
 * @create: 2018-12-24 19:50
 */
public class Demo03LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("b");
        linkedList.addFirst("first");
        linkedList.addLast("last");
    }
}
