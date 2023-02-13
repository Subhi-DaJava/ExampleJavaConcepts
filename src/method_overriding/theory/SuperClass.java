package method_overriding.theory;

/**
 * We can also override and overload an instance method in a subclass at the same time.
 * Overloaded methods do not override superclass instance methods. They are new methods, unique to the subclass.
 * Remember, overriding and overloading are different mechanisms, but you can mix them together in one class hierarchy.
 */
public class SuperClass {
    public static void main(String[] args) {
        SubClass clazz = new SubClass();
        clazz.invokeInstanceMethod();    // SubClass: invokeInstanceMethod() is overridden
        clazz.invokeInstanceMethod("s"); // SubClass: overloaded invokeInstanceMethod(String)
    }

    public void invokeInstanceMethod() {
        System.out.println("SuperClass: invokeInstanceMethod");
    }
}

class SubClass extends SuperClass {

    @Override
    public void invokeInstanceMethod() {
        System.out.println("SubClass: invokeInstanceMethod is overridden");
    }

    // @Override -- method doesn't override anything
    // @Override -- compile error
    public void invokeInstanceMethod(String s) {
        System.out.println("SubClass: overloaded invokeInstanceMethod(String)");
    }
}
