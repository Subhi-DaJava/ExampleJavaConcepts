package tostring_methode.practice.test1;

/**
 * Here is an object of the class:
 * <p>
 * Employee emp = new Employee("Khon", 10_000_000L);
 * What does the following invocation return?
 * <p>
 * emp.toString();
 * <p>
 * You are given the following class hierarchy:
 */
public class Person {
    public static void main(String[] args) {
        Employee emp = new Employee("Khon", 10_000_000L);
        System.out.println(emp.toString());
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
}
