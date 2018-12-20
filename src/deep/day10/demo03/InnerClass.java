package deep.day10.demo03;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-20 22:07
 */
public class InnerClass {
    public static void main(String[] args) {
        //使用静态内部类,buneng实例化外部类在实例化内部类
//        Outer.Inner oi=new Outer().new Inner();
        Outer.Inner oi = new Outer.Inner();
        oi.show();
        //内部静态类静态方法访问
        oi.show2();
        Outer.Inner.show2();
    }
}
