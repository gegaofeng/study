package deep.day10.demo04;

/**
 * @program: study
 * @description:补全Outer类，使代码分别输出30，20，10
 * @author: Feng
 * @create: 2018-12-20 22:15
 */
public class InnerClass {
    public static void main(String[] args) {
        Outer.inner oi = new Outer().new inner();
        oi.show();
    }
}
