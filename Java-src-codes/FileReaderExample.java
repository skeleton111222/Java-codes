import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        // Define the file path (relative path in this case)
        String filePath = "input.txt";

        // Create FileReader and BufferedReader objects
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            // Initialize FileReader and BufferedReader
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);

            // Read the file line by line and print each line to the console
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            // Close the BufferedReader and FileReader to release resources
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file reader.");
                e.printStackTrace();
            }
        }
    }
}