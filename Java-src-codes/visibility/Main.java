import package1.VisibilityDemo;
import package1.SamePackageClass;
import package2.DifferentPackageClass;

public class Main {
    public static void main(String[] args) {

        VisibilityDemo demo = new VisibilityDemo();

        System.out.println("Public field: " + demo.publicField);
        demo.publicMethod();

        demo.accessPrivate();

        SamePackageClass samePackage = new SamePackageClass();
        samePackage.accessDefault(demo);

        DifferentPackageClass differentPackage = new DifferentPackageClass();
        differentPackage.accessProtected();
    }
}
