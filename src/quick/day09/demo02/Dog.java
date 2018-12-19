package quick.day09.demo02;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 20:35
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗睡觉");
    }

    public void watchHouse() {
        System.out.println("狗看家");
    }
}
