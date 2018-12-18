package day08.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-18 20:21
 */
public class Demo01BufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file08.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello");
        bw.close();
    }
}
