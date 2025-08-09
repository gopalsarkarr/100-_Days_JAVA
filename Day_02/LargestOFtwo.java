
import java.util.Scanner;

class LargestOFtwo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = obj.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = obj.nextInt();
        if (a >= b) {
            System.out.println(a+" is large number");
        }
        else {
            System.out.println(b+" 2is large number");
        }
    }
}