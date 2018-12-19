package quick.day09.demo03;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 20:45
 */
public class Demo01Calculate {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        calcu(calculator);
    }

    public static void calcu(Calculator calculator) {
        int result = calculator.sum(10, 22);
        System.out.println("结果是：" + result);
    }
}
