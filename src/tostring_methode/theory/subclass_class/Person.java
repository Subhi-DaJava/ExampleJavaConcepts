package tostring_methode.theory.subclass_class;

/**
 * Now we get the big problem — the program tries to get the string representation of the person
 * that includes the string representation of passport that includes the string representation of the person.
 * It causes java.lang.StackOverflowError.
 * <p>
 * class Passport {
 * private String country;
 * private String number;
 * private Person owner;
 * <p>
 * There are several ways to fix this situation:
 * <p>
 * do not include fields represented by your classes in the toString() method;
 * exclude the field in the toString() method from one of the classes.
 */
public class Person {
    public static void main(String[] args) {
        Passport passport = new Passport();
        passport.setNumber("4343999");
        passport.setCountry("Austria");

        Person person = new Person();
        person.setName("Michael");
        System.out.println(person);  // first print

        person.setPassport(passport);
        System.out.println(person);  // second print
    }

    private String name;
    private Passport passport;

    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + ",passport=" + passport + "}";
    }
}

class Passport {

    private String country;
    private String number;

    // getters and setters


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{country=" + country + ",number=" + number + "}";
    }
}