public class Q06 {

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

public static void PrimeRange(int n) {
    for(int i=2; i<=n; i++){
        if(isPrime(i))
    }
    
}
    public static void main(String[] args) {
        
    }
}