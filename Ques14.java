import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to convert: ");
        int number = scanner.nextInt();
        
        String binary = Integer.toBinaryString(number);
        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + binary);
        
        String hexadecimal = Integer.toHexString(number);
        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
        
        scanner.close();
    }
}