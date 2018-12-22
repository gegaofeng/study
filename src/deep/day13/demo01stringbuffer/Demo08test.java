package deep.day13.demo01stringbuffer;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-22 21:21
 */
public class Demo08test {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "====" + sb2);
        change(sb1, sb2);
        System.out.println(sb1 + "====" + sb2);
    }

    public static void change(StringBuffer s1, StringBuffer s2) {
        s1 = s2;
        s2.append(s1);
    }
}
