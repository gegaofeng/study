package deep.day16.demo04test;

import java.util.ArrayList;
import java.util.Random;

/**
 * @program: study
 * @description:随机产生10个重复数字
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:48
 */
public class Demo02Random {
    public static void main(String[] args) {
        //创建产生随机数对象
        Random r = new Random();
        //创建随机数集合
        ArrayList<Integer> arrayList = new ArrayList<>();
        //定义统计变量
        int sum = 0;
        //循环产生随机数
        while (sum < 10) {
            //产生随机数
            int num = r.nextInt(20) + 1;
            //随机数是否已经存在
            if (!arrayList.contains(num)) {
                arrayList.add(num);
                sum++;
            }
        }
        //遍历输出集合
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }
}
