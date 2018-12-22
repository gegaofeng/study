package deep.day13.demo01stringbuffer;

/**
 * @program: study
 * @description:StringBuffer学习
 * @author: Feng
 * @create: 2018-12-22 20:42
 */
public class Demo01 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("aaa");
        System.out.println(str.length());
        System.out.println(str.capacity());
        System.out.println("======");
    }
}
