public class Student {
    // Attributes
    private int rollNumber;
    private String name;
    private int marks;

    // Constructor to initialize attributes
    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }

    // Main method to create Student objects and display their details
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student(1, "Alice", 85);
        Student student2 = new Student(2, "Bob", 72);

        // Display student details and grade
        student1.displayDetails();
        student2.displayDetails();
    }
}
