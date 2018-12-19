package quick.day09.demo03;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 20:44
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
