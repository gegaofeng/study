package deep.day11.demo02;


/**
 * @program: study
 * @description: Object  toString()方法解析
 * @author: Feng
 * @create: 2018-12-21 20:52
 */
public class Demo01 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());
        System.out.println(s.toString());
        System.out.println(s.getClass().getName() + "@" + Integer.toHexString(s.hashCode()));
        //重写toString()方法
    }
}
