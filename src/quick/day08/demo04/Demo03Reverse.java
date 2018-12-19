package quick.day08.demo04;

import java.io.*;
import java.util.ArrayList;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-18 20:50
 */
public class Demo03Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file12.txt"));
        ArrayList<String> list = new ArrayList<>();
        //读取数据
        String line;
        while (((line = br.readLine()) != null)) {
            list.add(line);
        }
        br.close();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("file13.txt"));
        for (int i = list.size() - 1; i >= 0; i--) {
            bw.write(list.get(i));
            bw.newLine();
        }
        bw.close();
    }
}
