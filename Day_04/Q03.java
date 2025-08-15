//?? Binomial Coefficient 
public class Q03 {


        public static int Factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return  f;  
    }

    public static int Binomial(int n, int r) {
        int n_fact = Factorial(n);
        int r_fact = Factorial(r);
        int nm_fact = Factorial(n-r);

        
        int Bino = n_fact/(r_fact*nm_fact);
        return Bino;

    }
    public static void main(String[] args) {
        System.out.println("Bionomial Coeff. is: "+Binomial(5, 2));
        
    }
}