package day08.demo02;

import java.io.FileReader;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-18 20:06
 */
public class Demo04FileReaderArray {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file06.txt");
        char[] buf = new char[2];
        int length;
        while ((length = fr.read(buf)) != -1) {
            System.out.println("length=" + length);
            String str = new String(buf, 0, length);
            System.out.println("str=" + str);
        }
        fr.close();
    }
}
