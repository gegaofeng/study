package quick.day08.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-18 20:26
 */
public class Demo02NewLine {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file09.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello");
        bw.newLine();
        bw.write("Java");
        bw.close();
    }
}
