package visibility;

public class SamePackageClass {
    public void accessDefault(VisibilityDemo demo) {
        System.out.println("Default field from same package: " + demo.defaultField);
        demo.defaultMethod();
    }
}
