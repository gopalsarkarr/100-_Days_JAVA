
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 5;
        // int sum = a+b;
        // System.out.println(sum);
        Scanner obj = new Scanner(System.in);
        System.err.println("Enter 1st value");
        int a = obj.nextInt();
        System.out.println("Enter 2nd value");
        int b = obj.nextInt();
        int sum = a+b;
        System.out.println(sum);


    }
}