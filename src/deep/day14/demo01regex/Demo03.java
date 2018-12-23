package deep.day14.demo01regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: study
 * @description: 正则获取功能
 * @author: Feng
 * @create: 2018-12-23 15:28
 */
public class Demo03 {
    public static void main(String[] args) {
        String str = "jin tianzhen shiyi ge hao tian qi ,wo menyi qichu qu hi";
        String reg = "\\b\\w{3}\\b";
        Pattern pat = Pattern.compile(reg);
        Matcher m = pat.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
