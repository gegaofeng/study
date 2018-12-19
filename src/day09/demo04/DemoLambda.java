package day09.demo04;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 21:00
 */
public class DemoLambda {
    public static void main(String[] args) {
        method((int a, int b) -> {
            return a + b;
        });
        Calculator param = (int a, int b) -> {
            return a + b;
        };
        method(param);
    }

    public static void method(Calculator calculator) {
        int result = calculator.sum(10, 20);
        System.out.println("结果是：" + result);
    }
}
