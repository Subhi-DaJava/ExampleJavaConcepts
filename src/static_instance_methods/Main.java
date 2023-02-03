package static_instance_methods;

/**
 * To invoke a static method we don't need to create an object. We just call the method with the class name.
 * In other words, you can say that a static method belongs to a class
 *
 * An instance method requires a different invocation. As you already guessed, to invoke an instance method we have to create an object first.
 * Otherwise, there is no way to use an instance method.
 *
 * Instance methods have a great advantage: they can access fields of the particular object of the class
 *
 * Instance methods can take arguments and return values just as you saw in the previous topics.
 * Return values can be of any type including the same type as the defined class.
 *
 * Instance methods can access the fields of the class with "this" keyword.
 */
public class Main {
    public static void main(String[] args) {
        Humain.printStatic(); // will print It's a static method

        Humain oneHumain =  new Humain();
        oneHumain.printInstance(); // will print It's an instance method

        Humain otherHumain =  new Humain();
        otherHumain.printInstance(); // will print It's an instance method

        otherHumain.name = "OtherOne";
        oneHumain.work(); // null loves working!
        // The keyword "this" allows us to access a field of the particular object and distinguish it from the same field of another object.
        otherHumain.workTogetherWith(oneHumain); // OtherOne loves working with null!

        oneHumain.name = "oneHumain";
        otherHumain.workTogetherWith(oneHumain);// OtherOne loves working with oneHumain!
        oneHumain.work(); // oneHumain loves working!

        otherHumain.workTogetherWith(otherHumain); // OtherOne loves working with OtherOne!

        System.out.println("***********************************************************");
        Robot robot = new Robot();
        robot.moveRight(3); // x = 0 + 3;
        robot.moveUp(2);  // y = 0 + 2;
        robot.moveLeft(4); // x = 0;
        robot.moveUp(2); // y = 2 + 2;
        robot.moveRight(1); // x = 0 + 1; (1, 4)
        System.out.println("(" + robot.x + ", " + robot.y + ")");

        System.out.println("******************************************");
        BoxVolume boxVolume = new BoxVolume(3, 4, 5);
        System.out.println(boxVolume.getVolume());
    }
}
