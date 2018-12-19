package quick.day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-17 22:34
 */
public class Demo02FileWrite {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file02.txt", true);
        fw.write("World");
        fw.close();
    }
}
