public class PrintNum {
    public static void printDec(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}
// Print Number From n to 1; Decresing Order