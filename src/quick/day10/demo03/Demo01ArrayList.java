package quick.day10.demo03;

import java.util.ArrayList;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-19 21:42
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> recordList = new ArrayList<>();
        recordList.add("aaa,95");
        recordList.add("sss,93");
        recordList.add("www,82");

        ArrayList<Integer> scoreList = new ArrayList<>();

        for (int i = 0; i < recordList.size(); i++) {
            String record = recordList.get(i);
            String[] array = record.split(",");
            String score = array[1];
            scoreList.add(Integer.parseInt(score));
        }
        for (int i = 0; i < scoreList.size(); i++) {
            int num = scoreList.get(i);
            if (num > 90) {
                System.out.println(num);
            }

        }
    }
}
