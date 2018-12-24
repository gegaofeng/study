package deep.day16.demo01list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: study
 * @description: arraylist去重
 * @author: Feng
 * @create: 2018-12-24 19:55
 */
public class Demo04Quchong {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("a");
        //创建一个新集合，遍历原集合放入新集合中没有的元素
        ArrayList newArray = new ArrayList();
        Iterator i = arrayList.iterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            if (!newArray.contains(s)) {
                newArray.add(s);
            }
        }
        System.out.println(arrayList);
        System.out.println(newArray);
        System.out.println("不创建新集合====");
        //不创建新集合
        for (int j = 0; j < arrayList.size(); j++) {
            for (int k = j + 1; k < arrayList.size(); k++) {
                if (arrayList.get(j).equals(arrayList.get(k))) {
                    arrayList.remove(k);
                    //多个连续重复元素，删除该元素后，后者顶替前者序号，出现遗漏情况
                    k--;
                }
            }
        }
        System.out.println(arrayList);
    }
}
