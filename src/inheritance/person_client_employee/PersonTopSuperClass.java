package inheritance.person_client_employee;

/**
 * PersonTopSuperClass: the base class Person has fields for storing common data: name, year of birth, and address;
 *
 * If no any public setters and getters; Each class also has public getters and setters, but some are skipped in the code as these classes use the default no-argument constructor.
 *
 * Inheritance is a mechanism for deriving a new class from another class (base class).
 * The new class acquires some fields and methods of the base class. Inheritance is one of the main principles of object-oriented programming.
 * It allows developers to build convenient class hierarchies and reuse existing code.
 *
 * When it comes to inheritance, there are several terms.
 * A class derived from another class is called a subclass (it's also known as a derived class, extended class or child class).
 * The class from which the subclass is derived is called a superclass (also a base class or a parent class).
 *
 * Important points about inheritance in Java:
 * Java doesn't support multiple-class inheritance, meaning that a class can only inherit from a single superclass;
 * a class hierarchy can have multiple levels (class C can extend class B that extends class A);
 * a superclass can have more than one subclass.
 *
 * A subclass inherits all public and protected fields and methods from the superclass.
 * A subclass can also add new fields and methods. The inherited and added members will be used in the same way.
 *
 * A subclass doesn't inherit private fields and methods from the superclass.
 * However, if the superclass has public or protected methods for accessing its private fields, these members can be used inside subclasses.
 *
 * Constructors are not inherited, but the superclass's constructor can be invoked from the subclass using the special keyword "super".
 *
 * If you'd like the base class members to be accessible from all subclasses but not from the outside code (excluding the same package), use the access modifier protected.
 *
 * Inheritance represents the IS-A relationship. A base class represents the general and a subclass represents the particular or specific.
 *
 * We also can create an instance of any class included in the considered hierarchy.
 *
 * If a class is declared with the keyword "final", it cannot have subclasses at all.
 *
 * If you try to extend the class, a compile-time error will occur.
 * Some standard classes are declared as final: Integer, Long, String, Math. They cannot be extended from.
 */
public class PersonTopSuperClass {
    protected String name;
    protected int yearOfBirth;
    protected String address;

    // public getters and setters for all fields here
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
