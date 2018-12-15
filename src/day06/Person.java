package day06;

/**
 * @program: study
 * @description: person
 * @author: Feng
 * @create: 2018-12-15 10:28
 */
public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫"+name+",今年"+age+"岁。");
    }
    public void setAge(int num){
        age=num;
    }
    public int getAge(){
        return age;
    }
    public void setaaa(int num){
        age=num;
    }
}
