
import java.util.Scanner;

// Find the Product of a & b
public class Q01 {
    public static int Multiple(int a, int b) {
        int Product = a*b;
        return Product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter First value: ");
        int a = sc.nextInt();
        System.err.print("Enter Second value: ");
        int b = sc.nextInt();
        int Prod = Multiple(a, b);
        System.out.println("Product is: "+Prod);
    }
}