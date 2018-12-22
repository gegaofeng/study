package deep.day12.demo02String;

/**
 * @program: study
 * @description: 获取功能
 * @author: Feng
 * @create: 2018-12-22 15:35
 */
public class Demo05 {
    public static void main(String[] args) {
        String str1 = "helloworld";

        System.out.println(str1.indexOf(101));
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.indexOf('l', 3));
        System.out.println(str1.indexOf('l', 8));
        System.out.println(str1.indexOf('k', 3));
        System.out.println(str1.indexOf('k', 8));
        System.out.println(str1.substring(3));
        //截取包左不包右
        System.out.println(str1.substring(3, 8));

        System.out.println("=======");
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
    }
}
