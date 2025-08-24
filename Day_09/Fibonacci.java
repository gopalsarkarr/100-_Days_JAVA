public class Fibonacci {
    public static int fibo(int n) {
        if(n==0 || n==1) {
            return n;
        }
        int nm1 = fibo(n-1);
        int nm2 = fibo(n-2);
        int fbn = nm1+nm2;
        return fbn;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fibo(n));
        System.out.println(fibo(26));
        System.out.println(fibo(30));
        System.out.println(fibo(40));

    }
}