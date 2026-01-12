import java.util.Scanner; 
public class TryCatch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dividend:");
        int a= scanner.nextInt(); 
        System.out.println("Enter divisor:");
        int b= scanner.nextInt(); 
        try{
          int result= a/b;
          System.out.println("Quotient: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Cannot divide by zero!");
        }
        finally {
            System.out.println("Finally block executed: Exception handling completed.");
        }
    }
}