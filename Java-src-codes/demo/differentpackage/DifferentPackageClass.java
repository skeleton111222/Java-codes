package differentpackage;

import visibilitydemo.VisibilityDemo;

// This is in a DIFFERENT package and extends VisibilityDemo
public class DifferentPackageClass extends VisibilityDemo {
    public void accessProtected() {
        // Can access protected members because this is a subclass
        System.out.println("Protected field from different package subclass: " + protectedField);
        protectedMethod();
    }
}
