import java.io.*;
import java.util.Scanner;

public class FileWriterExample1 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.println("Please enter text to write to the file (type 'exit' to quit):");
        
        // Create FileWriter and BufferedWriter objects
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            // Initialize FileWriter and BufferedWriter to write to output.txt
            fileWriter = new FileWriter("output.txt");
            bufferedWriter = new BufferedWriter(fileWriter);

            String inputLine;
            while (true) {
                // Read user input
                inputLine = scanner.nextLine();

                // Check for the exit condition
                if (inputLine.equalsIgnoreCase("exit")) {
                    break;
                }

                // Write the input line to the file
                bufferedWriter.write(inputLine);
                bufferedWriter.newLine(); // Write a newline after each line
            }

            // Display a confirmation message
            System.out.println("Data has been successfully written to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file writer.");
                e.printStackTrace();
            }
            // Close the scanner
            scanner.close();
        }
    }
}