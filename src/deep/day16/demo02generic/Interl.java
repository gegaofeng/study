package deep.day16.demo02generic;

/**
 * @program: study
 * @description: 不知道泛型的实现类
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:05
 */
public class Interl<T> implements InterGeneric<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
