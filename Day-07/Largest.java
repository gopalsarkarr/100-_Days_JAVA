//## For a given set of strings, print the largest string
public class Largest {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String large = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(large.compareTo(fruits[i]) < 0) {
                large = fruits[i];
            }
        }
        System.out.println(large);
    }
}