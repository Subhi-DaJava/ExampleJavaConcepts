package static_instance_methods.static_member.example2;

/**
 * A static method may have arguments like a regular instance method or it may well have no arguments. But, unlike instance methods, static methods have several special features:
 * <p>
 * a static method can access only static fields and cannot access non-static fields;
 * a static method can invoke another static method, but it cannot invoke an instance method;
 * a static method cannot refer to this keyword because there is no instance in the static context.
 * Instance methods, however, can access static fields and methods.
 * <p>
 * Static methods are often used as utility methods that are the same for the whole project.
 * As an example, you can create a class with only static methods for performing typical math operations.
 * <p>
 * This example shows that you can invoke a static method from the instance context (constructors and instance methods),
 * but you can't invoke an instance method from a static context.
 * <p>
 * The only way to call an instance method from a static one is to provide a reference to this instance as an argument.
 * You can also create objects of other classes and call their methods in a similar way.
 */
public class SomeClass {
    public SomeClass() {
        invokeAnInstanceMethod(); // this is possible here
        invokeAStaticMethod();    // this is possible here too
    }

    public static void invokeAStaticMethod() {
        // it's impossible to invoke invokeAnInstanceMethod() here
    }

    public void invokeAnInstanceMethod() {
        invokeAStaticMethod();  // this is possible too
    }

    // The only way to call an instance method from a static one is to provide a reference to this instance as an argument.
    // You can also create objects of other classes and call their methods in a similar way.
    public static void invokeAStaticMethod(SomeClass someClassInstance) {
        // calling instance method from static context by passing instance as an argument
        someClassInstance.invokeAnInstanceMethod();

        // calling instance and static methods of AnotherClass instance
        AnotherClass anotherClassInstance = new AnotherClass();
        anotherClassInstance.invokeAnotherClassInstanceMethod();
        anotherClassInstance.invokeAnotherClassStaticMethod();
    }
}

class AnotherClass {
    public void invokeAnotherClassInstanceMethod() {

    }

    public static void invokeAnotherClassStaticMethod() {

    }
}
