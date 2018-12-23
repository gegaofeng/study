package deep.day14.demo04system;

import java.util.Arrays;

/**
 * @program: study
 * @description:
 * @author: Feng
 * @create: 2018-12-23 16:03
 */
public class demo01 {

    public static void main(String[] args) {


        //arratcopy()命名就是如此，历史遗留原因
        int[] arr = {12, 25, 154, 35};
        int[] arr2 = {25, 52, 12, 25, 36, 25, 36, 45};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr, 1, arr2, 2, 3);
        System.out.println("=====");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
