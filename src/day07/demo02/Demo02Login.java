package day07.demo02;

import java.util.Scanner;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-16 16:15
 */
public class Demo02Login {
    public static void main(String[] args) {
        String registerUserName = "admin";
        String registerPassword = "123456";
        //获取用命名密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
        //比较用户名密码
        if (registerUserName.equalsIgnoreCase(username) && registerPassword.equals(password)) {
            System.out.println("登陆成功");
        } else {
            System.out.println("用户名或密码错！");
        }
    }
}
