package static_instance_methods.static_member.example1;

import java.time.LocalDateTime;

/**
 * An example of a static method is the main method. It should always be static.
 * <p>
 * A class variable (static field) is a field declared with the static keyword.
 * It can have any primitive or reference type, just like a regular instance field. A static field has the same value for all instances of the class. It belongs to the class, rather than to an instance of the class.
 * <p>
 * If we want all instances of a class to share a common value, for example, a global variable,
 * it's better to declare it as static. This can save us some memory because a single copy of a static variable
 * is shared by all created objects.
 * <p>
 * Static variables can be accessed directly by the class name.
 * Generally, it's not a good idea to declare non-final public static fields, here we just used them as an example.
 * <p>
 * <p>
 * Let's see a more complex example. Here is a class with a static field named lastCreated.
 * The field stores the date of the last created instance.
 * <p>
 * The value of the static field is changed in the class constructor every time a new object is created.
 * <p>
 * The code below creates two instances and outputs intermediate results:
 */
public class SomeClass {
    public static LocalDateTime lastCreated;

    public SomeClass() {
        lastCreated = LocalDateTime.now();
    }

    public static void main(String[] args) {
        System.out.println(SomeClass.lastCreated);

        SomeClass instance1 = new SomeClass();
        System.out.println(SomeClass.lastCreated);

        SomeClass instance2 = new SomeClass();
        System.out.println(SomeClass.lastCreated);
    }
}
