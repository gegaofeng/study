package deep.day13.demo01stringbuffer;

/**
 * @program: study
 * @description: append()，insert()
 * @author: Feng
 * @create: 2018-12-22 20:46
 */
public class Demo02Insert {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        //append()返回该对象的引用
        StringBuffer str2 = str.append("hello");
        System.out.println(str);
        System.out.println(str2);
        //指定位置插入
        StringBuffer str3 = str.insert(2, "here");
        System.out.println(str3);
    }
}
