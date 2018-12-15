package day05;

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

    @Contract(pure = true)
    public static int sum(int a, int b) {
        return a + b;
    }

    @Contract(pure = true)
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
