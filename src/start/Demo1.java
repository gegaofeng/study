package start;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();
//        System.out.println(num);
//        String str=scanner.next();
//        System.out.println(str);
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println("=========");
        int sum2 = 0;
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 1) {
                sum2 += i;
            }
            i++;
        }
        System.out.println(sum2);
        System.out.println("=====");
        i=0;
        while (i<10){
            i++;
            if (i>5){
                continue;
            }
            System.out.println(i);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩");
        int a=sc.nextInt();
        if (a>90){
            System.out.println("优秀");
        }else if (a>=80){
            System.out.println("两号");
        }else {
            System.out.println("其他");
        }
    }
}
