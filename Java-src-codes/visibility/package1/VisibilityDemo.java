package package1;

public class VisibilityDemo {
    public int publicField = 10;

    public void publicMethod() {
        System.out.println("Public method accessed");
    }

    private int privateField = 20;

    private void privateMethod() {
        System.out.println("Private method accessed");
    }

    protected int protectedField = 30;

    protected void protectedMethod() {
        System.out.println("Protected method accessed");
    }

    int defaultField = 40;

    void defaultMethod() {
        System.out.println("Default method accessed");
    }

    public void accessPrivate() {
        System.out.println("Private field: " + privateField);
        privateMethod();
    }
}
