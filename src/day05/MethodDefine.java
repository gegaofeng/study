package day05;

import day04.ArrayMax;
import day04.ArrayProblem;

public class MethodDefine {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        ArrayMax arrayMax = new ArrayMax();
        System.out.println(arrayMax.s());
        System.out.println("=====");
        ArrayProblem a=new ArrayProblem();
        String[] arg=new String[]{};
//        a.main(arg);
        ArrayProblem.main(arg);
    }

    public static int sum(int a, int b) {
        System.out.println("开始执行求和方法：");
        int result = a + b;
        return result;
    }
}
