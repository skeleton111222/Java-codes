import visibilitydemo.VisibilityDemo;
import visibilitydemo.SamePackageClass;
import differentpackage.DifferentPackageClass;

public class Main {
    public static void main(String[] args) {
        VisibilityDemo demo = new VisibilityDemo();

        // Public
        System.out.println("Public field: " + demo.publicField);
        demo.publicMethod();

        // Private via public method
        demo.accessPrivate();

        // Default in same package
        SamePackageClass samePackage = new SamePackageClass();
        samePackage.accessDefault(demo);

        // Protected via subclass in different package
        DifferentPackageClass differentPackage = new DifferentPackageClass();
        differentPackage.accessProtected();

        // Cannot access default from different package → compile error
        // System.out.println(demo.defaultField); // ❌
        // demo.defaultMethod();                  // ❌
    }
}
