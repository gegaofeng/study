package day06;

/**
 * @program: study
 * @description: person
 * @author: Feng
 * @create: 2018-12-15 10:28
 */
public class Person {
    private String name;
    private int age;
    private boolean male;

    public Person() {
    }

    public Person(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void show() {
        System.out.println("我叫" + name + ",今年" + age + "岁。");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
