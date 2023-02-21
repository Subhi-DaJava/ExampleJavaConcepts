package inner_class.practice.test3;

/**
 * A bow and a cat
 * Choose the right output:
 * Cat Bob is red. The size of Bob is 15. Cat Bob has red bow. The size of bow is 15.
 * <p>
 * Cat Bob is red. The size of Bob is 10. Cat Bob has white bow. The size of bow is 10.
 * <p>
 * Cat Bob is white. The size of Bob is 15. Cat Bob has white bow. The size of bow is 10.
 * <p>
 * Cat Bob is white. The size of Bob is 10. Cat Bob has red bow. The size of bow is 15
 */
public class Cat {
    private String name;
    private String color;
    private int size;

    public Cat(String name, String color, int size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public class Bow {
        String color;
        int size;

        public Bow(String color, int size) {
            this.color = color;
            this.size = size;
        }

        public void printColor() {
            System.out.print("Cat " + name + " is " + color + ". ");
            System.out.print("The size of " + name + " is " + size + ". ");
            System.out.print("Cat " + name + " has " + this.color + " bow. ");
            System.out.print("The size of bow is " + this.size + ".");
        }
    }

    public static void main(String[] args) {

        Cat cat = new Cat("Bob", "white", 10);
        Cat.Bow bow = cat.new Bow("red", 15);

        bow.printColor();
    }
}
