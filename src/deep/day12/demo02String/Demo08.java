package deep.day12.demo02String;

/**
 * @program: study
 * @description: 寻找一个字符创中另一个字符串出现的次数
 * @author: Feng
 * @create: 2018-12-22 16:06
 */
public class Demo08 {
    public static void main(String[] args) {
        String str1 = "hehelloheeheheheheheghef";
        String str2 = "hehe";
        System.out.println(find(str1, str2));


    }

    public static int find(String str1, String str2) {
        int count = 0;
        while (str1.contains(str2)) {
            int index = str1.indexOf(str2);
            str1 = str1.substring(index + str2.length());
            count++;
        }
        return count;
    }
}
