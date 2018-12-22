package deep.day12.demo02String;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-22 14:53
 */
public class Demo01String {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
