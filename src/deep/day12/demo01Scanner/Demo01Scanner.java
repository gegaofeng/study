package deep.day12.demo01Scanner;

import java.util.Scanner;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-22 14:34
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()){
//            int x=sc.nextInt();
//            System.out.println("x="+x);
//        }
        //先获取一个数值在获取一个字符串，会出错，因为数值输入完成回车毁人认为是下一个字符
        int a = sc.nextInt();
        //解决方案
        //方法一：重新初始化一个scanner对象
        //方法二：全部输入为字符串，在进行类型转换
        Scanner sc2 = new Scanner(System.in);
        String str = sc2.nextLine();
        System.out.println("a=" + a + ",str=" + str);
    }
}
