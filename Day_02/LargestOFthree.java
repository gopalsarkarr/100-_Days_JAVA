import java.util.Scanner;
class LargestOFthree {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = obj.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = obj.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = obj.nextInt();
        if ((a>=b) && (a >= c)) {
            System.out.println("Largest Number Is "+a);
        }
        else if ((b>=c)) {
            System.out.println("Largest number is "+b);
        }
        else {
            System.out.println("Largest number is "+c);
        }
    }


}