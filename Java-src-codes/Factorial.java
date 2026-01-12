import java.util.Scanner;

public class Factorial {
    public static int fact(int n) {
        if (n < 0) {
           System.out.println("Enter positive numbers.");
            return 0;
        }
        int factorial= 1;
        if(n==0||n==1)
        {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        double root= Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + root);
        int factorial= fact(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
