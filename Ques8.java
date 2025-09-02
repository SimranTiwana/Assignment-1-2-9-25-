public class Ques8 {
    public static void main(String[] args) {
        
        int intVal = 34;
        double doubleVal = intVal; 

        System.out.println("Implicit Casting:");
        System.out.println("Int value: " + intVal);
        System.out.println("Converted to double: " + doubleVal);

        
        double num = 6.66;
        int intNum = (int) num; 

        System.out.println("Explicit Casting:");
        System.out.println("Double value: " + num);
        System.out.println("Converted to int: " + intNum);
    }
}