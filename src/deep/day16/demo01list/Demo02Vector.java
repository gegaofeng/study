package deep.day16.demo01list;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @program: study
 * @description: Vector
 * @author: Feng
 * @create: 2018-12-24 19:42
 */
public class Demo02Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");
        for (int i = 0; i < v.size(); i++) {
            String s = (String) v.get(i);
            System.out.println(s);
        }
        System.out.println("=====");
        //Vector()特有方法：public Enumeration elements(){}
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }
    }
}
