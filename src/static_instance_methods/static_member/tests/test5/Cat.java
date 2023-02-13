package static_instance_methods.static_member.tests.test5;

/**
 * Too many cats
 * Let's count cats! Implement a class named Cat and a static method getNumberOfCats.
 * <p>
 * These are some features of the class:
 * <p>
 * The class Cat has two instance fields: a string name and an int age, and one static int field counter.
 * The static counter field allows you to know how many cats have already been created.
 * The class should have a constructor for initializing the instance fields.
 * During the initialization of a new cat, the value of the static field counter should be incremented.
 * If counter > 5, the message "You have too many cats" must be printed to System.out.
 * Your static method getNumberOfCats returns the current number of created cats and prints no messages.
 * <p>
 * Take a look at the example:
 * <p>
 * Let's assume seven instances of the class Cat have already been created. Then the correctly implemented method Cat.getNumberOfCats() should return 7.
 * <p>
 * Note that the message "You have too many cats" should appear twice: the first time when creating the sixth cat and the second time when creating the seventh cat.
 */
public class Cat {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Cat cat = new Cat("cat" + i, i);
            System.out.println(Cat.getNumberOfCats());
        }
    }

    public String name;
    public int age;
    public static int counter = 0;
    public static final int NUMBER = 5;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (counter > NUMBER) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}
