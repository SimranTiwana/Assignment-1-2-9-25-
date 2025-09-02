class Ques15 {
    public static void main(String[] args) {
        int num1 = 4;
        System.out.println("Primitive variable value: " + num1);

        String s1 = new String("Chitkara ");
        System.out.println("Reference variable value: " + s1);

        String s2 = s1;
        s2 = s2 + "University"; 

        System.out.println("After modifying s2:");
        System.out.println("s1: " + s1); 
        System.out.println("s2: " + s2);

        int num2 = num1;
        num2 = 10; 
        System.out.println("After modifying num2:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
