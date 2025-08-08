
import java.util.*;

//Calculate area of circle
public class Area {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Redius");
        float red = obj.nextFloat();
        float area = 3.14f * red * red;
        System.out.println("Area of circle is: "+area);
    }
}