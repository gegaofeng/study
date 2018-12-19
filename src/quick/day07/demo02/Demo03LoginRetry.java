package quick.day07.demo02;

import java.util.Scanner;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-16 16:21
 */
public class Demo03LoginRetry {
    public static void main(String[] args) {
        String registerUserName = "admin";
        String registerPassword = "123456";

        for (int i = 1; i <= 3; i++) {
            //获取用命名密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            //比较用户名密码
            if (registerUserName.equalsIgnoreCase(username) && registerPassword.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("登录次数耗尽！");
                } else {
                    System.out.println("用户名或密码错！剩余次数" + (3 - i) + "次");
                }

            }
        }

    }
}
