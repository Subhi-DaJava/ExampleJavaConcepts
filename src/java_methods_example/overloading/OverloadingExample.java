package java_methods_example.overloading;

/**
 * Overloading a form of static (compile-time) polymorphism.
 */
public class OverloadingExample {
    public static void main(String[] args) {
        print("some string");
        print("another string", 2);
        print(2, "another string again");
        print(5);
    }

    public static void print(String stringToPrint) {
        System.out.println(stringToPrint);
    }

    public static void print(String stringToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int times, String stringToPrint) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }

    public static void print(int val) {
        System.out.println(val);
    }

    // Overloading and casting

}
