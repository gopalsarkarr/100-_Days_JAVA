public class Palindrom {
    public static void printPalindrom(String str) {
        for(int i=0; i< str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
                System.out.println("Not palindrom");
                return;
            }
        }
        System.out.println("Yes Palindrom");

    }
    public static void main(String[] args) {
        String str = "hellolleh";
        printPalindrom(str);
        
    }
}


//Time Complexity O(n)