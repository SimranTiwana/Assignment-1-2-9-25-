public class Ques19 {
    public static void main(String[] args) {
        long largeLong = 123456789012345L;
        float floatValue = largeLong;
        
        System.out.println("Original long value: " + largeLong);
        System.out.println("Value stored in float: " + floatValue);
        
        if ((long) floatValue == largeLong) {
            System.out.println("The long value can be stored in a float without loss of precision.");
        } else {
            System.out.println("The long value cannot be stored in a float without loss of precision.");
        }
    }
}