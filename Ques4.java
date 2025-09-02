public class Ques4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After swapping:");
        System.out.println("Value of A:  " + a);
        System.out.println("Value of B: " + b);
    }
}