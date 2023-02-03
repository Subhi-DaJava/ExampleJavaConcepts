package static_instance_methods;

/**
 * Human class
 */
public class Humain {
    String name;
    int age;

    public static void printStatic() {
        System.out.println("It's a static method");
    }

    public void printInstance() {
        System.out.println("It's an instance method");
    }

    public static void averageWorking() {
        System.out.println("An average human works 40 hours per week.");
    }

    public void work() {
        // The keyword this represents a particular instance of the class.
        System.out.println(this.name + " loves working!");
    }

    public void workTogetherWith(Humain humain) {
        // The keyword "this" represents a particular instance of the class.
        // The keyword "this" allows us to access a field of the particular object and distinguish it from the same field of another object.
        System.out.println(this.name + " loves working with " + humain.name + '!');
    }
}
