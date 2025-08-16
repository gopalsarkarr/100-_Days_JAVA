//Pairs in an arrays
public class Pairs {
    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i =0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length;  j++){
                System.out.print("("+curr+","+numbers[j]+ ")");
                tp++;
            }
            System.out.println();
        }                                                     //TC= O(n^2)
        System.out.println("total pairs: "+tp);
    }
    public static void main(String[] args) {
        int number[]={2, 4, 6, 8, 10};
        printPairs(number);
    }
}