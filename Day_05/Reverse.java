//Reverse an sorted array Time using O(n) & Space O(1)
public class Reverse {

    public static void Rev(int numbers[]) {
        int first =0, last = numbers.length-1;


        while(first < last) {

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }




    public static void main(String[] args) {
        int number[]={2, 4, 6, 8, 10};

        Rev(number);
        for(int i=0; i<number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
        
    }
}
