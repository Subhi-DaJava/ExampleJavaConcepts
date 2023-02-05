package inheritance.referencing_subclass.test.vehicle;

/**
 * all incorrect statements:
 * Vehicle car = new Car(); // (1)
 *
 * car.setRegNumber("ABC-123"); // (2)
 * car.setNumberOfSeats(5); // (3)
 *
 * String regNumber = car.getRegNumber(); // (4)
 * int seats = car.getNumberOfSeats(); // (5)
 *
 * result: 3 & 5
 */
public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car(); // (1)
        car.setRegNumber("ABC-123"); // (2)
        //car.setNumberOfSeats(5); // (3)
        String regNumber = car.getRegNumber(); // (4)
        //int seats = car.getNumberOfSeats(); // (5)
    }
}
