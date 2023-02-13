package pholymorphism.theory.parent_child;

/**
 * Kinds of polymorphism
 * In general, polymorphism means that something (an object or another entity) has many forms.
 *
 * Java provides two types of polymorphism: static (compile-time) and dynamic (run-time) polymorphism.
 * The first one is achieved by method overloading, the second one is based on inheritance and method overriding.
 *
 * The more theoretical approach subdivides polymorphism into several fundamentally different types:
 *
 * Ad-hoc polymorphism refers to polymorphic functions that can be applied to arguments of different types,
 * but behave differently depending on the type of the argument to which they are applied. Java supports it as method overloading.
 * Subtype polymorphism (also known as subtyping) is a possibility to use an instance of a subclass when an instance of the base class is permitted.
 * Parametric polymorphism is when the code is written without mention of any specific type and thus can be used transparently with any number of new types.
 * Java supports it as generics or generic programming.
 *
 * Note: subtype (runtime) polymorphism (discussed only) that is widely used in object-oriented programming.
 */
public class Theory {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.sayHello();
        Parent child = new Children();
        child.sayHello();

        Children children = new Children();
        children.sayHello();
    }

}

class Parent {
    protected void sayHello() {
        System.out.println("Hello from parent");
    }
}
class Children extends Parent {
    @Override
    protected void sayHello() {
        System.out.println("Hello from children");
    }
}