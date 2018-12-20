package deep.day10.demo04;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-20 22:13
 */
public class Outer {
    public int num = 10;

    class inner {
        public int num = 20;

        public void show() {
            int num = 30;
            /*
            System.out.println(?);
            System.out.println(?);
            System.out.println(?);
             */
            System.out.println(num);
            System.out.println(this.num);
            //内部类与外部类没有继承关系，所以不能使用super
//            System.out.println(super.num);
            //变量非静态无法访问
//            System.out.println(Outer.num);
            //实例化外部类
            System.out.println(new Outer().num);
            //通过this限定外部类
            System.out.println(Outer.this.num);
        }
    }
}
