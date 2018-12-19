package quick.day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-17 22:41
 */
public class Demo04FileWriteCharacter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file04.txt", true);
        fw.write("Hello");
        fw.write("中国");
        fw.close();
    }
}
