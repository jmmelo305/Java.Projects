public class Calculator {
    // TODO: Create multiple versions of a 'multiply' method that can handle:
    // 1. Two integers
    // 2. Three integers
    // 3. Two double values
    // 4. An integer and a string (repeat the string that many times)
    public static int multiply (int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    public static int multiply (int num1, int num2, int num3) {
        int result = num1 * num2 * num3;
        return result;
    }
    public static Double multiply (double num1, double num2) {
        Double result = num1 * num2;
        return result;
    }


    public static String multiply (int num, String msg) {
        String result = " ";
        for (int i = 0; i < num; i++) {
           result += msg;
       }
       return result;
    }









    public static void main(String[] args) {
        // Test all your overloaded methods   
        System.out.println("Two ints: " + multiply(5, 3));
        System.out.println("Three ints: " + multiply(5, 3, 2));
        System.out.println("Two doubles: " + multiply(5.5, 3.2));
        System.out.println("Int and string: " + multiply(3, "Hi!"));
    }
}