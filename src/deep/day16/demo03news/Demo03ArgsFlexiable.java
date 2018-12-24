package deep.day16.demo03news;

/**
 * @program: study
 * @description: 可变参数
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:29
 */
public class Demo03ArgsFlexiable {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
    }

    public static int sum(int... a) {
        //其实a是数组
        int sum = 0;
        for (int v : a) {
            sum += v;
        }
        return sum;
    }
}
