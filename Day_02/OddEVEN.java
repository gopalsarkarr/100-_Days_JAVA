import java.util.Scanner;
class OddEVEN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println(a+" Is Even Number");
        }
        else {
            System.out.println(a+" Is Odd Number");
        }
    }
}