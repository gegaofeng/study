package quick.start;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello,World!");
        int num1=100;
        System.out.println(num1);
        {
            System.out.println(num1);
            num1=200;
        }
        System.out.println(num1);
    }
}
