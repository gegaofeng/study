package deep.day10.demo03;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-20 22:04
 */
public class Outer {
    private int num = 10;
    private static int num2 = 20;

    //内部类可以用static修饰，因为内部类可以看作是外部类的成员变量
    public static class Inner {
        public void show() {
            //静态类只能访问外部类静态变量
//            System.out.println(num);
            System.out.println(num2);
        }

        public static void show2() {
//            System.out.println(num);
            System.out.println(num2);
        }
    }
}
