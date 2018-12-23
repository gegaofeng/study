package deep.day14.demo01regex;

import java.util.Scanner;

/**
 * @program: study
 * @description: 正则表达式
 * @author: Feng
 * @create: 2018-12-23 14:52
 */
public class Demo01 {
    public static void main(String[] args) {
        String reg = "[\\d]{1,10}";
        String str = "1235";
//        System.out.println(str.matches(reg));
        checkMail();
    }

    public static void checkMail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱");
        String mail = sc.nextLine();
        String reg = "\\w+@\\w{2,6}(\\.\\w{2,6})+";
        System.out.println(mail.matches(reg));
    }
}
