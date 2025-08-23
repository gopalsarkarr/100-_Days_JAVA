public class New {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gopal";
        s1.roll = 40;
        s1.Password="abcd";

        Student s2 = new Student(s1);
        s2.Password= "xyz";
        
    }
}

class Student {
    String name;
    int roll;
    String Password;

    // Student(Student s1) {
    //     this.name= s1.name;
    //     this.roll =s1.roll;
    // }

    Student() {
        System.out.println("Constructor is called");
    }

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
    
}

    // Deep Copy Constructor
