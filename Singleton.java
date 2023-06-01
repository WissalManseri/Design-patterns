public class Singleton {

    // Static instance variable of the Singleton class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // initialization code here
    }

    // Static method to get the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            // Create a new instance if none exists
            instance = new Singleton();
        }
        return instance;
    }

    // Methods of the Singleton class here
    public void showMessage() {
        System.out.println("Hello, World!");
    }
}

/*In this example, the Singleton class has a static instance variable instance and a private constructor to prevent instantiation of the class from outside. The getInstance() method is used to create a single instance of the Singleton class and return it. If no instance exists, a new one is created. Finally, the showMessage() method is an example of a method that can be called on the singleton instance.
