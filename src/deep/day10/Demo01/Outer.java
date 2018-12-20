package deep.day10.Demo01;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-20 21:30
 */
public class Outer {

    //补全代码输出“HelloWorld”
    public static Inter method() {
        return new Inter() {
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }

}
