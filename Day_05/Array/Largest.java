//Find the largest & Smallest value of the Arrays----------------------------------------------------------
public class Largest {
    public  static int getLargest(int number[]) {
        int Larg = Integer.MIN_VALUE;
        int Small = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++) {
            if(Larg < number[i]) {
                Larg = number[i];
            }
            if(Small > number[i]) {
                Small = number[i];
            }
        }
        System.out.println("Smallest value is: "+Small);
        return Larg;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 9, 7, 8, 6, 4};
        System.out.println("Largest value is: "+getLargest(numbers));

    }
}