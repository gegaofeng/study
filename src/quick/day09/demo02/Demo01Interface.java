package quick.day09.demo02;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 20:30
 */
public class Demo01Interface {
    public static void main(String[] args) {
        //创建
        Animal cat = new Cat();
        //只能调用接口中定义的方法，无法调用实现类中的专有方法
        cat.eat();
        cat.sleep();
        //cat.catchMouse();
        ((Cat) cat).catchMouse();
    }
}
