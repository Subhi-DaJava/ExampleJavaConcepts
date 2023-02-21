package inner_class.theory.rule;

/**
 * From inside the inner class, we can see all methods and fields of the outer class even if they are private.
 * And don't forget that we can use everything else according to access modifiers as well.
 *
 * An inner class is associated with an instance of its enclosing class.
 * So to instantiate an inner class and get access to it, you need to instantiate the outer class first:
 */
public class OuterClass {
    public class InnerClass {

    }
}
