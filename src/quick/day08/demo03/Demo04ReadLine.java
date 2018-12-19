package quick.day08.demo03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-18 20:35
 */
public class Demo04ReadLine {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file10.txt");
        BufferedReader br = new BufferedReader(fr);

//        String line = br.readLine();
//        System.out.println(line);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
