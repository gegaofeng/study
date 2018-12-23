package deep.day14.demo03random;

import java.util.Random;

/**
 * @program: study
 * @description: random随机类
 * @author: Feng
 * @create: 2018-12-23 15:55
 */
public class demo01 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10));
        }
    }
}
