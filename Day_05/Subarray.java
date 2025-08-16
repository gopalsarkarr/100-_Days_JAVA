public class Subarray {
    public static void printSubarray(int numbers[]) {
        int ts =0;
        for(int i=0; i<numbers.length; i++){
            // int St = numbers[i];
            for(int j=i; j<numbers.length; j++) {
                // int end = numbers[j];

                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray is: "+ts);
    }
    public static void main(String[] args) {
        int numbers[]= {2, 4, 6, 8, 10};
        printSubarray(numbers);
    }
}