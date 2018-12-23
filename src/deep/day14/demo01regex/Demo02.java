package deep.day14.demo01regex;

/**
 * @program: study
 * @description: 正则表达式匹配、分割、替换字符串
 * @author: Feng
 * @create: 2018-12-23 15:14
 */
public class Demo02 {
    public static void main(String[] args) {
//        splite();
        replace();
    }

    //分割
    public static void splite() {
        String age = "18-26";
        String reg = "-";
        String[] strArr = age.split(reg);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }

    //替换
    public static void replace() {
        String str = "asdfg123456hjkl";
        //去除数字
        String reg = "\\d+";
        String result = str.replaceAll(reg, "***");
        System.out.println(str);
        System.out.println(result);
    }
}
