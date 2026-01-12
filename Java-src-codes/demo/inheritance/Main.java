class Animal {
    public void animal() {
        System.out.println("Animal class accessed.");
    }

    public void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog bark.");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animal();
        dog.sound();
        dog.eat(); // overridden method
    }
}
