package deep.day13.demo02string;

/**
 * @program: study
 * @description: 数组排序
 * @author: Feng
 * @create: 2018-12-22 21:41
 */
public class Demo01Array {
    public static void main(String[] args) {
        int[] array = {1, 54, 21, 36, 45, 68, 48};
        System.out.println(array[1]);
        printArray(array);
//        bubbleSort(array);
        selectSort(array);
        printArray(array);
    }

    //选择排序
    public static void selectSort(int[] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = x + 1; y < array.length - 1; y++) {
                if (array[y] > array[y + 1]) {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int k = 0; k < array.length - 1 - i; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.print('[');
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println(']');
    }
}
