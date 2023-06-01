/*To use the Singleton class, you can simply call Singleton.getInstance() to get the singleton instance and call its methods as necessary:*/

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the singleton instance
        singleton.showMessage();
    }
}
