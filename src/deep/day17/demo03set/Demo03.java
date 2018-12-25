package deep.day17.demo03set;

import java.util.HashSet;

/**
 * @program: study
 * @description: 自定义类HashSet
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-25 20:24
 */
public class Demo03 {
    public static void main(String[] args) {
        HashSet<Student> ha = new HashSet<>();
        //实例化一系列学生
        Student s1 = new Student("a", 11);
        Student s6 = new Student("a", 11);
        Student s2 = new Student("b", 22);
        Student s3 = new Student("c", 33);
        Student s4 = new Student("e", 44);
        Student s5 = new Student("f", 55);
        //添加
        ha.add(s1);
        ha.add(s2);
        ha.add(s3);
        ha.add(s4);
        ha.add(s5);
        ha.add(s6);
        //遍历
        for (Student s : ha) {
            System.out.println(s.getName() + "----" + s.getAge());
        }
    }

}
