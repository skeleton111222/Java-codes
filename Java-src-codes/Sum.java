public class Sum {
    public static int calculateSum(int a, int b) {  //static method
        return a + b;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + calculateSum(num1, num2));
    }
}