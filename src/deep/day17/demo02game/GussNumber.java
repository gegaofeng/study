package deep.day17.demo02game;

import java.util.Scanner;

/**
 * @program: study
 * @description: 猜数字
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-25 19:41
 */
public class GussNumber {
    public static void start() {
        int number = (int) (Math.random() * 100 + 1);
        int cout = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数字（1-100）");
            int guessNumber = scanner.nextInt();
            cout++;
            //判断数字大小
            if (guessNumber < number) {
                System.out.println("你猜的数字小了");
            } else if (guessNumber > number) {
                System.out.println("你猜的数字大了");
            } else {
                System.out.println("恭喜你" + cout + "次就猜中了");
                break;
            }
        }

    }
}
