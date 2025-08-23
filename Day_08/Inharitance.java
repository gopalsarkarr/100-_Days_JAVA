public class Inharitance {
    public static void main(String[] args) {
        // Fish shark =  new Fish();
        // shark.eat();
        Dog Hey = new Dog();
        Hey.eat();
        Hey.legs= 4;
        System.out.println(Hey.legs);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("ets");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals {
    String Bread;
}

// class Fish extends Animal {
//     int fish;
//   void swim(){
//     System.out.println("Can Swims in Water");

//   }
  
//   }