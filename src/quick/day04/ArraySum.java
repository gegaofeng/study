package quick.day04;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 354, 4, 56,};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
