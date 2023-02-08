package super_keyword.test.test3;

/**
 * What value does the following code print?
 *
 * C c = new C(2);
 * c.printField();
 */
public class A {
    public static void main(String[] args) {
        C c = new C(2);
        c.printField();
    }
    protected int field;

    public A(int val) {
        this.field = val + 1;
    }
}

class B extends A {

    protected int field;

    public B(int val) {
        super(val);
        this.field = super.field * 2; // B
    }
}

class C extends B {

    protected int field;

    public C(int val) {
        super(val);
        this.field = super.field + 2; // C
    }

    public void printField() {
        System.out.println(super.field);
        System.out.println(this.field);
    }
}
