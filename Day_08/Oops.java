public class Oops {
    public static void main(String[] args) {
        Pen p1 =new Pen();        //create a pen object
        p1.setColor("Blue");
        System.out.println(p1.getClass());
        p1.setTip(5);
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "gopal.sarkar";
        myAcc.setPassword("Gugkhjn");
    }

}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}




class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }
    
    int getTip(){
        return this.tip;
    }
 
    void setColor(String newColor){
    this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}
