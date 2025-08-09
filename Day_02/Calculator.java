// Income Tax calculator
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a your Income: ");
        int Income = obj.nextInt();
        int tax;

        if (Income < 500000) {
            tax =0;
        }
        else if (Income >= 500000 && Income <= 1000000) {
            tax=(int) (Income*0.2);
        }
        else {
            tax=(int) (Income*0.3);
        }
        System.out.println("Your Tax Is: "+tax);
    }
}
