package quick.day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-17 22:44
 */
public class Demo05FileWritOverload {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file05.txt");
        fw.write(65);


        fw.close();
    }
}
