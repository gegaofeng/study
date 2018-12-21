package deep.day11.demo04;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-21 20:48
 */
public class Student implements Cloneable {
    private String name;
    private int age;

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
