package deep.day12.demo02String;

/**
 * @program: study
 * @description:比较判断
 * @author: Feng
 * @create: 2018-12-22 15:11
 */
public class Demo02 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "he";
        String s3 = "HE";
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.contains(s2));
        System.out.println(s1.contains(s3));
        String s4 = "";
        String s5 = null;
        System.out.println(s4.isEmpty());
        System.out.println(s5.isEmpty());
    }
}
