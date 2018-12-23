package deep.day14.demo02math;

import java.util.Scanner;

/**
 * @program: study
 * @description:获取任意范围的随机数
 * @author: Feng
 * @create: 2018-12-23 15:49
 */
public class Demo02Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入范围下限");
        int min = sc.nextInt();
        System.out.println("请输入上限");
        int max = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int random = (int) ((max - min + 1) * Math.random() + min);
            System.out.println(min + "和" + max + "之间的随机数：" + random);
        }

    }

}
