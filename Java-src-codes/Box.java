public class Main {
    public static void main(String[] args) {
        int a= 10;  // primitive value
        Integer autobox_value =a;   // Autoboxing
        System.out.println("Autoboxed Integer object: " + autobox_value);

        int unbox = autobox_value;   // Unboxing
        System.out.println("Unboxed int value: " + unbox);

        System.out.println("Autoboxed and then unboxed value: " + (int) autobox_value);
        System.out.println("Original primitive int and unboxed value comparison: " + (a == unbox));
    }
}