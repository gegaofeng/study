package deep.day11.demo03;


/**
 * @program: study
 * @description: Object  equals()方法解析
 * @author: Feng
 * @create: 2018-12-21 20:52
 */
public class Demo01 {
    public static void main(String[] args) {
        Student s1 = new Student("a", 1);
        Student s2 = new Student("a", 1);
        System.out.println(s1 == s2);
        Student s3 = s1;
        System.out.println(s1 == s3);
        System.out.println("-----equals比较");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Student s4 = new Student("b", 11);
        System.out.println(s1.equals(s4));
    }
}
