
public class Strings {
    public static void printLetter(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + "");
        }
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str2 = new String("xyz@#1234");


        //Strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Gopal Sarkar";
        // System.out.println(fullName.length());


        // concatenation
        String firstName = "Gopal";
        String lastName = "Sarkar";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName.charAt(1));


        printLetter(fullName);

    }
}