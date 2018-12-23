package deep.day14.demo06calender;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @program: study
 * @description: calender类
 * @author: Feng
 * @create: 2018-12-23 17:06
 */
public class demo01Calender {
    public static void main(String[] args) {
        //判断这年2月有几天
        //输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, 2, 1);
        calendar.add(Calendar.DATE, -1);
        //判断这天日期
        System.out.println(calendar.get(Calendar.DATE));
    }
}
