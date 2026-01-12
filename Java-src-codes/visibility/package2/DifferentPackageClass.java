package package2;

import package1.VisibilityDemo;

public class DifferentPackageClass extends VisibilityDemo {
    public void accessProtected() {
        System.out.println("Protected field from different package: " + protectedField);
        protectedMethod();
    }
}
