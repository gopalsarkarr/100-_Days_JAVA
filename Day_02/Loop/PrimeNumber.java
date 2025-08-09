
import java.util.Scanner;
// Check a Number A number is prime or not
class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        if(n == 2) {
            System.out.println(n+" Is prime number");
        }
        else {
            boolean isprime = true;
        for (int i = 2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                isprime = false;
            }
        }
        if (isprime == true){
            System.out.println(n+" Is prime number.");
        }
        else {
            System.out.println(n+" Is not a prime number");
        }

        }

        
    }
}