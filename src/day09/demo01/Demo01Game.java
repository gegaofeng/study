package day09.demo01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-18 22:06
 */
public class Demo01Game {
    public static void main(String[] args) throws IOException {
        //1.
        ArrayList<Hero> list = new ArrayList<>();
        //2.读文件
        System.out.println("加载文件数据到集合中");
        loadFromFile(list);
        //3.判断
        boolean isNew = list.size() == 0;
        System.out.println("这是不是新队伍：" + isNew);
        if (isNew) {
            System.out.println("创建五个对象家到集合中");
            addFiveHeros(list);
        }
        System.out.println("我们的阵容是：");
        showHeros(list);
//        System.out.println("遍历输出");
        int totalAttack = getTotalAttack(list);

        System.out.println("我们的总战斗力是：" + totalAttack);
        //保存
        if (isNew) {
            savaToFile(list);
        }
        System.out.println("游戏结束");
    }

    public static void loadFromFile(ArrayList<Hero> list) throws IOException {

        /**
         * @Description:
         * @Param: [list]
         * @return: void
         * @Author: Feng
         * @Date: 2018/12/18
         */

        BufferedReader br = new BufferedReader(new FileReader("friends.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            //转换为英雄对象
            String[] arr = line.split(",");
            String name = arr[0];
            int attack = Integer.parseInt(arr[1]);
            String type = arr[2];
            Hero hero = new Hero(name, attack, type);
            list.add(hero);
        }
        br.close();
    }

    public static void savaToFile(ArrayList<Hero> list) throws IOException {

        /**
         * @Description:
         * @Param: [list]
         * @return: void
         * @Author: Feng
         * @Date: 2018/12/18
         */

        BufferedWriter bw = new BufferedWriter(new FileWriter("friends.txt"));
        //遍历写入数据
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            //hero转换为字符串
            String str = hero.getName() + "," + hero.getAttack() + "," + hero.getType();
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }

    public static int getTotalAttack(ArrayList<Hero> list) {

        /**
         * @Description:
         * @Param: [list]
         * @return: int
         * @Author: Feng
         * @Date: 2018/12/18
         */

        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            total += hero.getAttack();
        }
        return total;
    }

    public static void showHeros(ArrayList<Hero> list) {

        /**
         * @Description:
         * @Param: [list]
         * @return: void
         * @Author: Feng
         * @Date: 2018/12/18
         */

        for (int i = 0; i < list.size(); i++) {
            Hero hero = list.get(i);
            System.out.println("name:" + hero.getName() + ",attack:" + hero.getAttack() + ",type:" + hero.getType());
        }
    }

    public static void addFiveHeros(ArrayList<Hero> list) {

        /**
         * @Description:
         * @Param: [list]
         * @return: void
         * @Author: Feng
         * @Date: 2018/12/18
         */

        //键盘输入英雄数据
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ":name");
            String name = sc.next();
            System.out.println(i + ":attack");
            int attack = sc.nextInt();
            System.out.println(i + ":type");
            String type = sc.next();
            //创建英雄对象
            Hero hero = new Hero(name, attack, type);
            list.add(hero);
        }
    }
}
