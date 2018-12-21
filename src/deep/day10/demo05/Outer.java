package deep.day10.demo05;

/**
 * @program: study
 * @description:局部内部类
 * @author: Feng
 * @create: 2018-12-20 22:22
 */
public class Outer {
    private int num = 10;

    public void method() {
        //final修饰后，该变量编译时直接编译为常量
        final int num2 = 20;
        class Inner {
            public void show() {
                System.out.println(num);
                //局部内部类访问局部变量，局部变量必须被final修饰
                System.out.println(num2);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
