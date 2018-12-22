package deep.day12.demo02String;

/**
 * @program: study
 * @description: 小测试
 * @author: Feng
 * @create: 2018-12-22 15:12
 */
public class Demo03 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        //变量先创建对象在拼接
        System.out.println(s3 == s1 + s2);
        System.out.println(s3.equals(s1 + s2));
        //常量编译时先进性字符串拼接在创建对象
        System.out.println(s3 == "hello" + "world");
    }
}
