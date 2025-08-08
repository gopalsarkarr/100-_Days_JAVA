
import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // byte -> short -> int -> float -> long -> double
        int a = 10;
        long b =a; 
        float m = 10.5f;
        int g = (int) m;
        System.out.println(g);
        char ch = 'G';
        int number = ch;
        System.out.println(number);
    }
}