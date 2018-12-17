package day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-17 22:37
 */
public class Demo03FileWriteLine {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file03.txt", true);
        fw.write("第一行");
        fw.write("\n");
        fw.write("第二行");
        fw.close();
    }
}
