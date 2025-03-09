package constructor.inheritance_constructor;

class A {
    A(int x) {
        System.out.println("A");
    }
}

class B extends A {

// compile error: call to super must be first statement in constructor
//    B() {
//        System.out.println("B Constructor");
//    }

    B() {
        super(10);
        System.out.println("B");
    }

    public static void main(String[] args) {
        new B();
    }
}


