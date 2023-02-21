package tostring_methode.theory.subcalss;

public class Person {
    public static void main(String[] args) {
        Person person = new Person("Helena");
        Employee employee = new Employee("Michael", 10_000);

        System.out.println(person);   // Person{name=Helena}
        System.out.println(employee); // Employee{name=Michael,salary=10000}
    }
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name=" + name + "}";
    }
}

class Employee extends Person {

    protected long salary;

    public Employee(String name, long salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name=" + name + ",salary=" + salary + "}";
    }
}
