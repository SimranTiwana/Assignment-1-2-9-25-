public class Ques16 {
    public static final double TAX_RATE = 0.18;
    
    public static void main(String[] args) {
        double price = 500.0;
        double tax = price * TAX_RATE;
        double total = price + tax;
        
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }
}