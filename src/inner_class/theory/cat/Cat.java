package inner_class.theory.cat;

/**
 * Let's move on to another example.
 * Imagine that you are writing a class Cat representing cats.
 * The Cat class may have a lot of fields and methods, but we may also use inner class structures.
 * For example, let's say you want a cat to have a bow. Then you need to create a new class Bow.
 * This class Bow would be quite small and specific, and you know you won't need a bow without a cat.
 * The solution is to create the class Bow inside the Cat class:
 */
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public class Bow {
        String color;

        public Bow(String color) {
            this.color = color;
        }

        public void printColor() {
            System.out.println("Cat " + Cat.this.name + " has a " + this.color + " bow.");
        }
    }
}
