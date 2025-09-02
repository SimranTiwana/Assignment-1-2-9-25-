public class Ques13 {
    static int staticVar = 0;  
    int instanceVar = 0;       
    
    public static void main(String[] args) {
        Ques13 obj1 = new Ques13();
        Ques13 obj2 = new Ques13();
        
        obj1.staticVar = 5;
        obj1.instanceVar = 10;
        
        System.out.println("obj1 - static: " + obj1.staticVar + ", instance: " + obj1.instanceVar);
        System.out.println("obj2 - static: " + obj2.staticVar + ", instance: " + obj2.instanceVar);
        
        obj2.staticVar = 15;
        
        System.out.println("After modifying static through obj2:");
        System.out.println("obj1 - static: " + obj1.staticVar + ", instance: " + obj1.instanceVar);
        System.out.println("obj2 - static: " + obj2.staticVar + ", instance: " + obj2.instanceVar);
    }
}