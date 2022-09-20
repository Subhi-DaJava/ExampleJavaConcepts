package singletonclass;

public class MainForSingletonA {
    public static void main(String[] args) {
        SingletonA a = SingletonA.getInstance();
        SingletonA b = SingletonA.getInstance();
        SingletonA c = SingletonA.getInstance();

        System.out.println("Hashcode of a is " + a.hashCode());
        System.out.println("Hashcode of a is " + b.hashCode());
        System.out.println("Hashcode of a is " + c.hashCode());

        if(a ==  b && b == c) {
            System.out.println("The three objects point to the same memory location on the heap i.e, to the same object !");
        }
        else {
            System.out.println("The three objects DO NOt point to the same memory location on the heap !");
        }
    }
}
