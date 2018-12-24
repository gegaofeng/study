package deep.day16.demo02generic;

/**
 * @program: study
 * @description: 泛型接口实现类
 * @author: Feng
 * @Version:1.0
 * @create: 2018-12-24 21:01
 */
public class InterlImpl implements InterGeneric<String> {

    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
