package deep.day16.demo02generic;

/**
 * @program: study
 * @description: 泛型接口
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 20:59
 */
public class Demo03IntefGeneric {
    public static void main(String[] args) {
        InterGeneric<String> i = new InterlImpl();
        i.show("hello");
        System.out.println("====");
        InterGeneric<Integer> i2 = new Interl<>();
        i2.show(100);
    }
}
