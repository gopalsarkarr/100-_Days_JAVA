public class Q05 {
    //Check Prime number or not


    public static boolean  isPrime(int n) {
        if(n==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){           //math.sqrt(n) == root of n
            if(n%i == 0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        
    }
}