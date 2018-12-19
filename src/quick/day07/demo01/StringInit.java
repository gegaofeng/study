package quick.day07.demo01;

/**
 * @program: study
 * @description: 字符串
 * @author: Feng
 * @create: 2018-12-16 15:50
 */
public class StringInit {
    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        String str1 = new String(array);
        System.out.println(str1);

        String str2 = new String(array, 2, 3);
        System.out.println(str2);
    }
}
