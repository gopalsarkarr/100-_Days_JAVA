// Calculator Using SWitch Case
import java.util.Scanner;
class Calculators {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = obj.nextInt();
        System.out.print("Enter B: ");
        int b = obj.nextInt();
        System.out.println("Enter Operator");
        char operator = obj.next().charAt(0);

        switch (operator) {
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
                break;
            default: System.out.println("my Calculator not advance");
        }
    }
}