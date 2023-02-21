package tostring_methode.practice.test7;

/**
 * Convert persons and patients to string
 * Here are two classes Person and Patient. The second class extends the first one.
 *
 * Override toString in both classes to return a string representation of persons and patients.
 *
 * If an object is Person, the overridden method toString must return something like:
 *
 * Person{name=Case Maxwell,age=30}
 * If an object is Patient, the overridden method toString must return something like:
 *
 * Patient{name=John Purcell,age=30,height=182}
 */
public class Person {
    public static void main(String[] args) {
        Person person = new Person("Case", 30);
        Patient patient = new Patient("Jhon", 30, 182);
        System.out.println(patient);
        System.out.println(person);
    }
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ",age=" + age +
                "}";
    }
}

class Patient extends Person {

    protected int height;

    public Patient(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Patient{name=" + name +
                ",age=" + age +
                ",height=" + height + "}";
    }
}
