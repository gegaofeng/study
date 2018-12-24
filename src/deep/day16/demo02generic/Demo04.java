package deep.day16.demo02generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: study
 * @description: 泛型通配符
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:08
 */
public class Demo04 {
    /*
    ?:任意Object类
    ? extends E:向下遍历子类（含自身）
    ? super E:向上遍历（含自身）
     */
    public static void main(String[] args) {
        Collection<Object> c1 = new ArrayList<>();
        //错误
//        Collection<Object> c2=new ArrayList<Animal>();
//        Collection<Object> c3=new ArrayList<Dog>();
        //均可以
        Collection<?> c4 = new ArrayList<>();
        Collection<?> c5 = new ArrayList<Animal>();
        Collection<?> c6 = new ArrayList<Dog>();
        //
        Collection<? extends Animal> c7 = new ArrayList<Animal>();
        Collection<? extends Animal> c8 = new ArrayList<Dog>();
//        Collection<? extends Animal> c9=new ArrayList<Object>();

    }
}

