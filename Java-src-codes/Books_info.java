class Book {
    private String isbn;
    private String title;
    private double price;

    // Constructor to initialize the attributes
    public Book(String isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    // Method to apply discount
    public void applyDiscount(double discountPercentage) {
        price -= price * (discountPercentage / 100);
    }

    // Method to get details of the book
    public String info() {
        return "ISBN: " + isbn + ", Title: " + title + ", Price: $" + String.format("%.2f", price);
    }
}
public class Books_info{
    public static void main(String[] args) {
        // Create two Book objects
        Book book1 = new Book("978-3-16-148410-0", "The Great Gatsby", 15.99);
        Book book2 = new Book("978-1-61-729054-3", "To Kill a Mockingbird", 12.99);
        
        // Display details of both books before applying discount
        System.out.println("Before applying discount:");
        System.out.println(book1.info());
        System.out.println(book2.info());

        // Apply discount to the first book
        book1.applyDiscount(10); // Applying a 10% discount

        // Display details of both books after applying discount
        System.out.println("\nAfter applying discount to book 1:");
        System.out.println(book1.info());
        System.out.println(book2.info());
    }
}
