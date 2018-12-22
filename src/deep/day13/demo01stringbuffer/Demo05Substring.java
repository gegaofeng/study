package deep.day13.demo01stringbuffer;

/**
 * @program: study
 * @description: 截取
 * @author: Feng
 * @create: 2018-12-22 20:56
 */
public class Demo05Substring {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("asdfghjkl");
        String s = str.substring(2);
        System.out.println(str);
        System.out.println(s);
        //包左不包右
        String s2 = str.substring(2, 4);
        System.out.println(s2);
    }
}
