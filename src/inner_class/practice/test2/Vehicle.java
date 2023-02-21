package inner_class.practice.test2;

/**
 * Improve your vehicle
 * Add the field int horsePower to the class Engine.
 * <p>
 * Then create a method void printHorsePower inside the inner class that
 * prints the name of your Vehicle and the horsePower of it's Engine.
 * <p>
 * For a vehicle called Dixi with 20 horsepower the output of printHorsePower should be:
 * <p>
 * Vehicle Dixi has 20 horsepower.
 * And don't forget to add constructors in both classes!
 * <p>
 * Please, don't use access modifier private for methods.
 */
public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    class Engine {

        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

        void printHorsePower() {
            System.out.println("Vehicle " + name + " has " + horsePower + " horsepower.");
        }
    }
}

// this code should work
class EnjoyVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Engine engine = vehicle.new Engine(20);
        engine.printHorsePower();
    }
}
