package deep.day17.demo03set;

import java.util.TreeSet;

/**
 * @program: study
 * @description: TreeSet类，底层是二叉树结构，红黑树，有序：A:自然排序，B：比较器排序
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-25 20:49
 */
public class Demo05TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(87);
        treeSet.add(23);
        treeSet.add(243);
        treeSet.add(243);
        treeSet.add(45);
        treeSet.add(45);
        treeSet.add(16);
        treeSet.add(2);
        treeSet.add(2);
        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }
}
