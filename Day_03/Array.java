
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.err.println("phy: "+marks[0]);
        System.err.println("chem: "+marks[1]);
        System.err.println("math: "+marks[2]);

        marks[2] = marks[2] * 2;
        System.err.println("math: "+marks[2]);

    }
}