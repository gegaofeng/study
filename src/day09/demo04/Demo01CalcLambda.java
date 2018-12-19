package day09.demo04;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 20:50
 */
public class Demo01CalcLambda {
    public static void main(String[] args) {
        method(((a, b) -> a + b));
    }

    public static void method(Calculator calculator) {
        int result = calculator.sum(10, 20);
        System.out.println("结果是：" + result);
    }
}
