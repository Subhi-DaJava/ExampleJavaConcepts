package record_example.theory;

import java.util.Locale;

/**
 * Records
 * A record, like classes, is a way to declare a new type in Java.
 * Now you may wonder why we need records when we already have classes to do the same job.
 * The answer is boilerplate code, or, more precisely, boilerplate reduction.
 * The biggest difference from something like Lombok is that Records have language-level support,
 * which means you don't need any third-party dependencies, so they are more attractive to use.
 * They basically are value objects out of the box as they are immutable: their state cannot be modified once created.
 * <p>
 * Notice the way the constructor is written. Unlike a class constructor,
 * a record constructor doesn't have a formal parameter list: instead,
 * it's just the access modifier followed by the name of the record and ending with curly brackets.
 * This constructor type is called a compact constructor.
 * <p>
 * Getters in records are named after the variable they give back.
 * In our example above, the getter name of username would be username().
 * Now we can customize these getters by simply repeating the same method signature and inserting our code in curly brackets:
 * <p>
 * Recap: Records cannot:
 * <p>
 * be abstract;
 * extend classes;
 * declare instance fields;
 * be extended by classes.
 * On the other hand, records can:
 * <p>
 * be declared inside a class;
 * implement interfaces;
 * be generic;
 * be compatible with annotations;
 * have static components;
 * have constructors;
 * have instance methods.
 * <p>
 * Generated Code
 * What is not generated automatically by the compiler? setter!!
 */
record User(String username, String password) {
    public User {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username and password must not be null");
        }
    }

    public String username() {
        return username.toUpperCase(Locale.ENGLISH);
    }
}

public class RecordDemo {
    public static void main(String[] args) {
        User user = new User("username", "password");
        System.out.println(user.password());
        System.out.println(user.username());
        User userNull = new User(null, null);
        System.out.println(userNull.password());

    }
}
