public class Abstract {
    public static void main(String[] args) {
        // Horse h =new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);

        // Chicken c= new Chicken();
        // c.eat();
        // c.walk();
        Mustang myHorse  = new Mustang();           //Animal-> Horse -> Mustang
        
    }
}

abstract class Animal {
    String color;
    Animal() {
        System.out.println("animal Constructor called");
    }

    void eat()  {
        System.out.println("animal eats");
    }
    abstract void walk();
}


class Horse extends Animal {

    Horse(){
        System.out.println("Horce Constructor called");
    }

    void changeColor() {
        color = "dark";
    }
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Mustang extends Horse {

    Mustang() {
        System.out.println("Mustang Contractor called");
    }
    
}

class Chicken extends Animal {
    void changeColor() {
        color = "white";
    }
    void walk(){
        System.out.println("Chicken Walks on 2 legs");
    }
}