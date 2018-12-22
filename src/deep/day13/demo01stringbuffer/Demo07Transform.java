package deep.day13.demo01stringbuffer;

/**
 * @program: study
 * @description:String、StringBuffer对象转换
 * @author: Feng
 * @create: 2018-12-22 20:58
 */
public class Demo07Transform {
    public static void main(String[] args) {
        String str = new String("asdfg");
        //不能直接转换
//        StringBuffer stringBuffer="hello";
        StringBuffer strb = new StringBuffer(str);
        System.out.println(str);
        System.out.println(strb);
        System.out.println("======");
        //stringbuffer转string
        String str2 = strb.toString();
        String str3 = new String(strb);
        System.out.println(str2);
        System.out.println(str3);
    }

}
