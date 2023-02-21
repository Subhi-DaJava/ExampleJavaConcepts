package inner_class.theory.rule;

/**
 * Remember about access modifiers: if you make an inner class private,
 * then it can only be accessed from inside the outer class. The same works for fields and methods.
 * <p>
 * Prior to Java 16, inside an inner class, you cannot define:
 * <p>
 * any static members;
 * <p>
 * enums;
 * <p>
 * an Interface.
 *
 * And, at last, the formal (just a little bit) list of inner class benefits:
 *
 * They increase encapsulation.
 * Our Bow is only for Cat. You can make a field (method) private and hide it from other classes,
 * using it only inside the inner class.
 *
 * Inner classes will organize your code and make your packages be more logical:
 * all the magic equipment for Superhero will be in one place.
 *
 * The main idea of Inner classes is to hide some code from other classes and increase encapsulation.
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
    }
}
