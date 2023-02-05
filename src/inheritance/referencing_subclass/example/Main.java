package inheritance.referencing_subclass.example;

/**
 * Both approaches to the reference in action
 *
 * The basic rule goes like this:
 * If class A is a "superclass of class B" and "class B is a superclass of class C" then "a variable of class A" can reference "any object derived from that class"
 * (for instance, objects of "the class B" and "the class C"). This is possible because each subclass object is an object of its superclass but not vice versa.
 *
 * Note:
 * "A superclass reference" can be used for any of "its subclass objects", but you cannot assign "an object of the parent class" to "the reference of its subclass"
 * When referring to "objects with a superclass reference" you "cannot invoke methods and fields of a subclass"
 *
 * Always cast "an object of a subclass" to a superclass — and vice versa, but only if the object is indeed "an instance of the subclass".
 */
public class Main {
    public static void main(String[] args) {
        // Subclass reference: create instances of the subclasses using the constructor
        // In this case, we used subclass references because "the types of the references" and "the created object" are the "same".
        Person person = new Person(); // the reference is Person, the object is Person
        Client client = new Client(); // the reference is Client, the object is Client
        Employee employee = new Employee(); // the reference is Employee, the object is Employee
        Manager manager = new Manager();

        // Superclass reference: creating objects using the constructor, refer to a subclass object using the reference to the superclass
        // In this case, we used "the superclass reference" because "the references have the type of the superclass" and "the actual types of created objects" are "subclasses".
        Person clientSub = new Client(); // the reference is Person, the object is Client
        Person employeeSub = new Employee(); // the reference is Person, the object is Employee
        Person managerSubOfEmployee = new Employee();
        Person manageSubOfPerson = new Manager();

        // you cannot assign "an object of one subclass" to "a reference of another subclass" because they don't inherit each other
        // Client whoIsIt = new Employee(); // it's impossible

        // you cannot assign "an object of the parent class" to "the reference of its subclass"
        // Client clientSuper = new Person(); // it's impossible too

        System.out.println("********************** Accessing fields and methods through a superclass reference **********************************");
        //  However, we cannot access specific members of the subclass through the base class reference.
        //  We have access only to those members of "the object" that are defined by "the type of reference".

        // Person employeeSub = new Employee(); // the reference is Person, the object is Employee
        employeeSub.setName("EmployeeOne");
        employeeSub.setYearOfBirth(42);
        employeeSub.setAddress("OpenClassRooms");
        // The superclass Person doesn't have "the method setSalary of the class Employee". You cannot invoke the method through the superclass reference.
        // The same rule holds for fields.
        //employeeSub.setSalary(50000L); // Compile-time error, the base class "doesn't know" about the method

        // Employee employee = new Employee(); // the reference is Employee, the object is Employee
        employee.setSalary(35000L); // is Ok, type and object

        System.out.println("***************************************** When to use the superclass reference ****************************************");
        // Using "a superclass reference" imposes some restrictions on accessing class members.
        // processing an array (or another collection) of objects which have different types from the same hierarchy;
        //a method that accepts an object of the base class, but can also work with objects of its subclasses.
        person.setName("personSuper");
        Person[] persons = { person, client, employeeSub };

        Person.printNames(persons);

        System.out.println("**************************** Casting between superclass and subclass *******************************************");
        /*
        Cast "an object of a subclass" to "its superclass".
        It may also be possible to cast "an object from a superclass type" to "a subclass", but only if "the object is an instance of this subclass",
        otherwise a "ClassCastException" will be thrown. Be careful when casting a class to its subclass.
         */
        Person personCast = new Client();

        Client clientAgain = (Client) personCast; // it's ok
        clientAgain.setName("ClientAgain");
        System.out.println(clientAgain.getName());

        Employee employeeCast = (Employee) personCast; // the ClassCastException occurs here
        employeeCast.setName("EmployeeCastClient");
        System.out.println(employeeCast.getName());

    }
}
