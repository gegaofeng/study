package quick.day09.demo02;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 20:26
 */
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
