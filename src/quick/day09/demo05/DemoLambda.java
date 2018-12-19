package quick.day09.demo05;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 21:07
 */
public class DemoLambda {
    public static void main(String[] args) {
        //标准格式
        method((int x) -> {
            return ++x;
        });
        //精简格式，可推导可省略
        //省略参数类型
        method((x) -> {
            return ++x;
        });
        //有且仅有一个参数时可以省略括号
        method(x -> {
            return ++x;
        });
        //语句体只有一句可以省略return
        method(x -> ++x);
    }

    public static void method(MyInter inter) {
        int result = inter.singlePlus(10);
        System.out.println("结果是：" + result);
    }
}
