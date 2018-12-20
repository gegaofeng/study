package deep.day10.demo02;

/**
 * @program: study
 * @description: Outer
 * @author: Feng
 * @create: 2018-12-20 21:46
 */
public class Outer {
    private int num = 10;

    public void method() {
        //外部类访问内部类方法必须实例化内部类
        Inner inner = new Inner();
        inner.show();
    }

    //成员内部类
    class Inner {
        public void show() {
            //内部类可以直接访问外部类变量，包括私有变量
            System.out.println("外部类变量：" + num);
        }
    }

    public void method2() {
        //局部内部类
        class Inner2 {

        }
    }
}
