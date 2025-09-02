import java.util.*;

public class Ques10{
    public static void main(String[] args) {
        final double PI = 3.14159;  
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;
        System.out.println("Radius of circle:" + radius);
        System.out.println("Area of circle: " + area);
    }
}