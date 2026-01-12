import java.util.Scanner; 
public class TryCatchInArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        String a= scanner.nextLine();
        try {
            int number = Integer.parseInt(a);
            System.out.println("Entered number: " + number);
        }
        catch(NumberFormatException e){
            System.out.println("Error: Invalid number format!");
        }
        int[] numbers = {1, 2, 3};
        System.out.println("Enter a index(0 to 2):");
        int i= scanner.nextInt();
        try {
            System.out.println("Element at given index is: " + numbers[i]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds!");
        } 
        finally {
            System.out.println("Finally block executed: Exception handling completed.");
        }
        scanner.close();
    }
}