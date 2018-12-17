package day08.demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-17 22:28
 */
public class Demo01FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file01.txt");
        fw.write("Hello World");
        //使用后关闭释放资源，切记！！！
        fw.close();
    }
}
