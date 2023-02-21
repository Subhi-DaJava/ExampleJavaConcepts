package tostring_methode.practice.test3;

/**
 * Convert vehicles and cars to string
 * There are two classes Vehicle and Car. The second class extends the first one.
 *
 * Override toString in both classes to return a string representation of vehicles and cars.
 *
 * If an object is Vehicle, the overridden method toString must return something like:
 *
 * Vehicle{licensePlate=ABC123}
 * If an object is Car, the overridden method toString must return something like:
 *
 * Car{licensePlate=ABC123,numberOfSeats=4}
 */
public class Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("ABC123");
        Car car = new Car("ABC123", 4);

        System.out.println(vehicle);
        System.out.println(car);
    }

    protected String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{licensePlate=" + licensePlate + "}";
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{licensePlate=" + licensePlate + ",numberOfSeats=" + numberOfSeats + "}";
    }
}
