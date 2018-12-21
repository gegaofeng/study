package deep.day11.demo04;


/**
 * @program: study
 * @description: Object  finalize(),clone()方法解析
 * @author: Feng
 * @create: 2018-12-21 20:52
 */
public class Demo01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student();
        //类实现cloneable接口才能调用克隆方法
        Object clone = s.clone();
        Student s2 = (Student) clone;
    }
}
