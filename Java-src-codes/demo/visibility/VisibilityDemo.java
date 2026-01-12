package visibility;

public class VisibilityDemo {
    public int publicField = 10;
    private int privateField = 20;
    protected int protectedField = 30;
    int defaultField = 40; // default access

    public void publicMethod() {
        System.out.println("Public method accessed");
    }

    private void privateMethod() {
        System.out.println("Private method accessed");
    }

    protected void protectedMethod() {
        System.out.println("Protected method accessed");
    }

    void defaultMethod() {
        System.out.println("Default method accessed");
    }

    public void accessPrivate() {
        System.out.println("Private field: " + privateField);
        privateMethod();
    }
}
