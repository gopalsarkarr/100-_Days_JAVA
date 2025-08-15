//Convert From Binary to Decimal 
public class Q07 {
    public static void biToDec(int BinNUm) {
        int mynum = BinNUm;
        int pow = 0;
        int decNum =0;

        while(BinNUm > 0){
            int lastDigit = BinNUm % 10;
            decNum = decNum + (lastDigit *(int)Math.pow(2, pow));
            pow++;
            BinNUm = BinNUm/10;
        }
        System.out.println("decimal of "+mynum+" ="+decNum);
        
    }
    public static void main(String[] args) {
        biToDec(101);
    }
}