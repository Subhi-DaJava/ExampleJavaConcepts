package static_instance_methods;

/**
 * The program that models the behavior of cars, fields: the int field yearModel, the string field mark, and the int field speed.
 *
 * void accelerate() that adds 5 to the speed each time it's called;
 * void brake() that subtracts 5 from the speed field each time it's called, the speed cannot be less than zero.
 */
public class Car {
    int yearModel;
    String mark;
    int speed;

    public void accelerate() {
        this.speed += 5;
    }
    public void brake() {
        this.speed -= 5;
        if(this.speed < 0) {
           this.speed = 0;
        }

    }
}
