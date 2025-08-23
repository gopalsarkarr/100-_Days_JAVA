public class Method {
    public static void main(String[] args) {
        // Calculator cal =new Calculator();
        // System.out.println(cal.sum(1,2));
        // System.out.println(cal.sum((float)1.5, (float)2.5));
        // System.out.println(cal.sum(1, 2, 3));
        Deer d = new Deer();
        d.eat();         //  overridding

        
    }
}
//Function Overloading Compile time
class Calculator {
    int sum(int a, int b) {
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }

    int  sum(int a, int b, int c) {
        return a+b+c;
    }
}

class Animal {
    void eat() {
        System.out.println("eats anythings");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}