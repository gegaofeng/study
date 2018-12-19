package quick.day08.demo04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-18 20:41
 */
public class Demo01FromLiatToFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbb");
        list.add("ccc");
        BufferedWriter bw = new BufferedWriter(new FileWriter("file11.txt"));
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
}
