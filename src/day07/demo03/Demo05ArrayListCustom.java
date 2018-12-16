package day07.demo03;

import java.util.ArrayList;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-16 16:58
 */
public class Demo05ArrayListCustom {
    public static void main(String[] args) {
        Person one = new Person("AAA", 18);
        Person two = new Person("bbb", 12);
        Person three = new Person("ccc", 123);
        ArrayList<Person> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        for (int i = 0; i < list.size(); i++) {
            Person per = list.get(i);
            System.out.println("name:" + per.getName() + ",age:" + per.getAge());
        }
    }
}
