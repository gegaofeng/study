package deep.day13.demo03integer;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-22 22:40
 */
public class Demo02Test {
    public static void main(String[] args) {
        //Integer内部有个-128--127的缓冲池，当数据在此范围内则直接返回，不创建对象
        Integer s3 = 127;
        Integer s4 = 127;
        System.out.println(s3 == s4);//true
        System.out.println(s3.equals(s4));//true
        Integer s5 = 128;
        Integer s6 = 128;
        System.out.println(s5 == s6);//false
        System.out.println(s5.equals(s6));//true
        Integer s = Integer.parseInt("127");
    }
}
