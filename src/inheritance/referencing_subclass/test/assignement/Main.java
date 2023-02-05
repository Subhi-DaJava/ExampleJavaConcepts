package inheritance.referencing_subclass.test.assignement;

/**
 * all incorrect assignments:
 *
 * A a1 = new A(); // (1)
 * A a2 = new C(); // (2)
 *
 * B b1 = new B(); // (3)
 * B b2 = new A(); // (4)
 * B b3 = new C(); // (5)
 *
 * C c1 = new B(); // (6)
 * C c2 = new C(); // (7)
 *
 * result 4 & 6
 */
public class Main {
    public static void main(String[] args) {
        A a1 = new A(); // (1)
        A a2 = new C(); // (2)

        B b1 = new B(); // (3)
       // B b2 = new A(); // (4)
        B b3 = new C(); // (5)

        //C c1 = new B(); // (6)
        C c2 = new C(); // (7)
    }
}
