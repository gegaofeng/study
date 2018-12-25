package deep.day17.demo01login;

import deep.day17.demo02game.GussNumber;

import java.util.Scanner;

/**
 * @program: study
 * @description: 用户测试类
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-25 19:20
 */
public class Test {
    public static void main(String[] args) {
        //初始界面
        out:
        while (true) {
            System.out.println("————————————欢迎光临——————————");
            System.out.println("1:登录");
            System.out.println("2:注册");
            System.out.println("3:退出");
            System.out.println("请输入你的选择：");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            //独享多次使用，定义在switch外
            UserDao ud = new UserDaoImpl();
            switch (choice) {
                case "1":
                    System.out.println("————————登录界面——————————");
                    System.out.println("请输入用户名：");
                    String username = scanner.nextLine();
                    System.out.println("请输入密码：");
                    String password = scanner.nextLine();
                    //调用登录功能
                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        System.out.println("登陆成功，可以玩游戏了");
                        System.out.println("你玩吗？Y/N");
                        while (true) {
                            String result = scanner.nextLine();
                            if (result.equalsIgnoreCase("Y")) {
                                GussNumber.start();
                                System.out.println("你还玩吗？Y/N");
                            } else {
                                break;
                            }
                        }
                        System.out.println("谢谢使用，欢迎下次再来");
                        System.exit(0);
                        //使用break退出，加标签
                        break out;
//
                    } else {
                        System.out.println("登录失败，用户名或密码错误");
                    }
                    break;
                case "2":
                    System.out.println("————————注册界面——————————");
                    System.out.println("请输入用户名：");
                    String newUsername = scanner.nextLine();
                    System.out.println("请输入密码：");
                    String newPassword = scanner.nextLine();
                    //
                    User user = new User();
                    user.setUsername(newUsername);
                    user.setPassword(newPassword);

                    //调用注册功能

                    ud.regist(user);
                    System.out.println("注册成功");
                    break;
                case "3":
                    System.out.println("谢谢使用，欢迎下次再来");
                    break out;
                default:
                    System.out.println("请输入正确的选项");
                    break;
            }
        }
    }
}
