package pholymorphism.practice;

/**
 * Runtime polymorphic behavior
 * You have an inheritance hierarchy consisting of two classes.
 */
public class BaseClass {
    public static void main(String[] args) {
        // What is the output of the code below?
        BaseClass clazz = new DerivedClass();
        clazz.print(); // It outputs two lines. The first one is "Derived class". The second one is "Base class".
    }
    public void print() {
        System.out.println("Base class");
    }
}
class DerivedClass extends BaseClass {

    public void print() {
        System.out.println("Derived class");
        super.print();
    }
}