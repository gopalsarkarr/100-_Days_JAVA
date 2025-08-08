// Product of two number
import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = obj.nextInt();
        System.out.println("Enter 2nd number");
        int b=obj.nextInt();
        int Product = a*b;
        System.out.println(Product);
    }
}