package deep.day12.demo02String;

import java.util.Scanner;

/**
 * @program: study
 * @description:模拟登陆
 * @author: Feng
 * @create: 2018-12-22 15:20
 */
public class Demo04 {
    public static void main(String[] args) {
        //预设用户名密码
        String name = "name";
        String pwd = "admin";
        String inname, inpwd;
        //创建输入对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("username:");
            inname = sc.nextLine();
            System.out.println("password:");
            inpwd = sc.nextLine();
            if (name.equals(inname) && pwd.equals(inpwd)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i < 2) {
                    System.out.println("用户名或密码错误，剩余尝试机会" + (2 - i) + "次");
                } else {
                    System.out.println("用户名或密码错误，账户冻结");
                }
            }
        }
    }
}
