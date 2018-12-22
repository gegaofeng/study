package deep.day13.demo01stringbuffer;

/**
 * @program: study
 * @description: delete()
 * @author: Feng
 * @create: 2018-12-22 20:52
 */
public class Demo03Delete {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("123456789");
        str.deleteCharAt(1);
        System.out.println(str);
        //删除，包左不包右
        str.delete(2, 3);
        System.out.println(str);
    }
}
