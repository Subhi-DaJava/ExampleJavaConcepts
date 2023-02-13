package method_overriding.theory.static_method;

/**
 * Hiding "static methods"
 * "Static methods" cannot be overridden.
 * If a subclass has a static method with the same signature (name and parameters)
 * as a static method in the superclass then the method in the subclass hides the one in the superclass.
 * It's completely different from method overriding.
 *
 * You will get a compile-time error if a subclass has a static method with the same signature as an instance method in the superclass or vice versa.
 * But if the methods have the same name but different parameters there should be no problems.
 */
public class Main {
    public static void main(String[] args) {
        SuperClass.staticMethod();          // super
        new SuperClass().staticMethod();    // super
        SubClass.staticMethod();            // sub
        new SubClass().staticMethod();      // sub

        SuperClass ss = new SubClass();
        ss.staticMethod();                  // super, because static method belongs to a class, not to an instance
    }
}

class SuperClass {
    public static void staticMethod() {
        System.out.println("super");
    }

    public void instanceMethod() {
        System.out.println("super");
    }
}

class SubClass extends SuperClass {
    public static void staticMethod() {
        System.out.println("sub");
    }

    // Static method instanceMethod() in SubClass cannot override instance method instanceMethod() in SuperClass
    /*public static void instanceMethod() {
        System.out.println("sub");
    }*/
}
