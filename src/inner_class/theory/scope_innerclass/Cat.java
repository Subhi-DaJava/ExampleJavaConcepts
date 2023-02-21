package inner_class.theory.scope_innerclass;

/**
 * Note, that inside the method putOnABow of the class Bow, we have access to the private method sayMeow of the class Cat.
 * And, as you can see, in the method sayMeow, we print the private field name of the class Cat and everything works fine.
 * Also, in the method printColor, we have direct access to the private field name of the class Cat.
 *
 * How about creating a cat Princess with a golden bow to prove that our code works?
 */
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    private void sayMeow() {
        System.out.println(this.name + " says: \"Meow\".");
    }

    public class Bow {
        String color;

        public Bow(String color) {
            this.color = color;
        }

        public void putOnABow() {
            Cat.this.sayMeow();
            System.out.println("Bow is on!");
        }

        public void printColor() {
            System.out.println("Cat " + Cat.this.name + " has a " + this.color + " bow.\n");
        }
    }
}
