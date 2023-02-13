package method_overriding.pratice;

/**
 * Here is a hierarchy of four classes: A, B, C, and D.
 * <p>
 * What does this code print? Enter the resulting character.
 * <p>
 * A a = new D();
 * a.method();
 */
public class hierarchy {
    public static void main(String[] args) {
        A a = new D();
        a.method();
    }
}

class A {

    public void method() {
        System.out.println("A");
    }
}

class B extends A {

    public void method() {
        System.out.println("B");
    }
}

class C extends B {

}

class D extends C {

    public void method() {
        super.method();
    }
}
// B