package deep.day10.demo02;

/**
 * @program: study
 * @description:访问内部类成员方法
 * @author: Feng
 * @create: 2018-12-20 21:54
 */
public class Demo02Inner {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
