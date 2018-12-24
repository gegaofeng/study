package deep.day16.demo02generic;

/**
 * @program: study
 * @description: 方法泛型、
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 20:57
 */
public class MethodGeneric {
    public <T> void show(T t) {
        System.out.println(t);
    }
}
