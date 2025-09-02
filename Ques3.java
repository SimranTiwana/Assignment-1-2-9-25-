public class Ques3 {
    public static void main(String[] args) {
        int a = 2, b = 4, temp;
        System.out.println("Before swapping:");
        System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("Value of A: " + a + ", Value of B:  " + b);
    }
}
