
import java.util.Scanner;

public class Function {

    public static void PrintHello() {
        System.out.println("Hello World");
        System.out.println("Hello Rahul");                 //Method
        System.out.println("Hello Babai");
    }

    public static int Calculate(int num1, int num2) {      // With Parameter or formal parameter
       
        int sum = num1 + num2;
        return sum;
        // PrintHello();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calculate(a,b);          //Arguments or actual parameters
        System.out.println("Sum is: "+sum);
    }

}