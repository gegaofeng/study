package deep.day15.demo02collection;

import deep.day11.demo03.Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @program: study
 * @description: Collection测试
 * @author: Feng
 * @create: 2018-12-23 21:24
 */
public class demo02Test {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList();
        Student s1 = new Student("a", 1);
        Student s2 = new Student("b", 2);
        Student s3 = new Student("c", 3);
        ((ArrayList) c).add(s1);
        ((ArrayList) c).add(s2);
        ((ArrayList) c).add(s3);
        Object[] obj = c.toArray();
        for (int i = 0; i < obj.length; i++) {
            Student s = (Student) obj[i];
            System.out.println(s.getName() + "====" + s.getAge());
        }
    }
}
