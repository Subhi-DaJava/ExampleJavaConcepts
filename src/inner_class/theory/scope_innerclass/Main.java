package inner_class.theory.scope_innerclass;
/**
 * And, yes, the bow is on!
 * As for the access from the outside world, remember that when you've instantiated an inner class,
 * you can do whatever you want according to access modifiers.
 * Now let's collect all the rules together and put them to a "hard disk"!
 */

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Princess");
        Cat.Bow bow = cat.new Bow("golden");

        bow.printColor();
        bow.putOnABow();
    }
}
