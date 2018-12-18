package day08.demo02;

import java.io.FileReader;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-17 22:50
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file06.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println(ch);
            System.out.println((char) ch);
        }
    }
}
