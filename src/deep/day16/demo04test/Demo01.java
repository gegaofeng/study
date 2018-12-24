package deep.day16.demo04test;

import deep.day11.demo03.Student;

import java.util.ArrayList;

/**
 * @program: study
 * @description: 集合嵌套
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:39
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Student> classOne = new ArrayList<>();
        ArrayList<Student> classTwo = new ArrayList<>();
        ArrayList<Student> classThree = new ArrayList<>();
        ArrayList<ArrayList<Student>> school = new ArrayList<>();
        //classOne
        classOne.add(new Student("a", 1));
        classOne.add(new Student("b", 2));
        classOne.add(new Student("c", 3));
        //classTwo
        classTwo.add(new Student("aa", 11));
        classTwo.add(new Student("bb", 22));
        classTwo.add(new Student("cc", 33));
        classTwo.add(new Student("dd", 44));
        //classThree
        classThree.add(new Student("ccc", 333));
        classThree.add(new Student("eee", 555));

        school.add(classOne);
        school.add(classTwo);
        school.add(classThree);
        //遍历集合
        for (ArrayList<Student> array : school) {
            for (Student s : array) {
//                System.out.println(s);
                System.out.println(s.getName() + "--" + s.getAge());
            }
        }
    }
}
