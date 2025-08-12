public class Largest {
    public static int getLargest(int number[]) {
        int Largest = Integer.MIN_VALUE;
        for(int i=0; i=number.length; i++) {
            if(Largest <number[i]){
                Largest = number[i];
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 5, 6, 9, 8, 4, 7};
    }
}