package deep.day11.demo02;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-21 20:48
 */
public class Student {
    private String name;
    private int age;

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
