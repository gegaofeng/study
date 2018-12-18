package day08.demo03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-18 20:28
 */
public class Demo03BufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file10.txt");
        BufferedReader br = new BufferedReader(fr);
//        int ch;
//        while ((ch=br.read())!=-1){
//            System.out.println((char)ch);
//        }

        char[] buf = new char[2];
        int lenght;
        while ((lenght = br.read(buf)) != -1) {
            String str = new String(buf, 0, lenght);
            System.out.println(str);
        }
        br.close();
    }
}
