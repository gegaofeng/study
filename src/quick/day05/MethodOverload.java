package quick.day05;

import org.jetbrains.annotations.Contract;

/**
 * @program: study
 * @description: overload
 * @author: Feng
 * @create: 2018-12-14 20:29
 */
public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Contract(pure = true)
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    @Contract(pure = true)
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum2(int a, int b, int c) {
        return a + b + c;
    }
}
