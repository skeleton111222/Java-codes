package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentCollectionDemo {
    public static void main(String[] args) {
        // a. Create an ArrayList to store multiple Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // b. Add at least 3 Student objects (some duplicates)
        studentList.add(new Student("Alice", 1));
        studentList.add(new Student("Bob", 2));
        studentList.add(new Student("Alice", 1)); // Duplicate
        studentList.add(new Student("Charlie", 3));

        // c. Iterate through ArrayList and display details
        System.out.println("Student List (ArrayList):");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // d. Create a HashSet to store multiple Student objects (removes duplicates)
        HashSet<Student> studentSet = new HashSet<>(studentList);

        System.out.println("\nStudent Set (HashSet):");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
