package inner_class.theory.cat;

/**
 * Look, we have created an instance of Cat and then created an instance of Bow using quite an interesting syntax.
 *
 * Here, the output will be:
 *
 * Cat Bob has a red bow.
 *
 * Remember that to use inner classes, we must create an instance of the outer class. In our example, we created a Cat.
 */
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Bob");
        Cat.Bow bow = cat.new Bow("red");

        bow.printColor();
    }
}
