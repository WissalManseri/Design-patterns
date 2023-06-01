public interface Animal {
    void makeSound();
}

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class AnimalFactory {
    public static Animal createAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal("dog");
        dog.makeSound(); // Output: Woof!

        Animal cat = AnimalFactory.createAnimal("cat");
        cat.makeSound(); // Output: Meow!
    }
}
/*In this example, we have an interface Animal with the method makeSound(), which is implemented by two concrete classes Dog and Cat. The AnimalFactory class has a static method createAnimal() that returns an instance of Animal based on the given type string. The Main class demonstrates how to use the AnimalFactory to create Dog and Cat objects and call their makeSound() method.

This is an example of the Factory Pattern because it uses a factory class (AnimalFactory) to create objects (Dog and Cat) without exposing the instantiation logic to the client code. The client code only needs to provide the type string to the factory method to get an instance of the desired object.
