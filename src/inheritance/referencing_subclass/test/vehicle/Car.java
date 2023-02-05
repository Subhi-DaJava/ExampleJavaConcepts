package inheritance.referencing_subclass.test.vehicle;

public class Car extends Vehicle {

    protected int numberOfSeats;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
