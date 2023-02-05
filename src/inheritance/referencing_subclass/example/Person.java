package inheritance.referencing_subclass.example;

/**
 * In Java, classes are organized into a hierarchy, which allows us to refer to objects in different ways.
 * <p>
 * Find out when it is a good idea to use a superclass reference and what restrictions you should keep in mind
 * <p>
 * Two ways to refer to a subclass object:
 * 1. Using the subclass reference: you can use the subclass reference to refer to its object;
 * 2. Using the superclass reference:
 * you can use a reference variable of the superclass to refer to any subclass object derived from that superclass
 * because a subclass is a special case of the superclass.
 * <p>
 * class has a default no-args constructor
 */

public class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;

    // printNames takes an array of Person and displays the names
    public static void printNames(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
