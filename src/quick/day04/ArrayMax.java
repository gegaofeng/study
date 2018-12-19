package quick.day04;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 10, 20, 40, 50, 30, 25, 60};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
    public ArrayMax(){
        System.out.println("construct");
    }
    public int s(){
        return 'a';
    }
}
