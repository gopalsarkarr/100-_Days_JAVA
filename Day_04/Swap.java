public class Swap {
    public static void Swapp(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
                                                                                  // Call by value

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Swapp(a, b);
    }
}