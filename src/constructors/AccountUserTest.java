package constructors;

import java.util.Optional;

/**
 * Account with three fields (code, balance, owner)
 * User with three fields (login, firstName, lastName).
 * Parameterized constructors.
 * code: "codeNumber123",
 * balance: 5200L,
 * owner: (login: "username", firstName: "firstName", lastName: "lastName").
 * Note that the owner is an instance of the User class.
 *
 * Note: Keyword "this"
 * To initialize the fields, the keyword "thi"s is used, which is a reference to the current object.
 * Usually, the keyword this is used when an instance variable and a constructor or a method variable share the same name.
 * This keyword helps to disambiguate these situations.
 * If you write something like name = name, it means that you're assigning the name variable to itself,
 * which, of course, doesn't make any sense. Frankly speaking, you may distinguish two objects simply by assigning another name to the variable,
 * like name = newName. It is not prohibited, but it is considered bad practice since these variables point to the same thing.
 * These are the reasons why the keyword this is extremely useful with constructors, fields, and methods.
 * The absence of extra variables makes the code look clearer and less overloaded.
 *
 * Recap:
 * Any Java class has a constructor to initialize objects;
 * A constructor has the same name as the class containing it;
 * A constructor has no return type, not even void;
 * If a class has no explicit constructors, the Java compiler automatically provides a default no-argument constructor;
 * If we want to introduce new variables to denote the same thing, make the code clearer and less loaded with extra variables, the keyword this is used.
 */
public class AccountUserTest {
    public static void main(String[] args) {

        Account account = new Account("codeNumber123", 5200L, new User("username", "FirstName", "lastName")); // if user null, output-> codeNumber123 5200

        process(account); // codeNumber123 5200 username FirstName lastName
    }

    static class Account {

        private String code;
        private long balance;
        private User owner;

        public Account(String code, long balance, User owner) {
            this.code = code;
            this.balance = balance;
            this.owner = owner;
        }

        public String getCode() {
            return code;
        }

        public long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }

    static class User {

        private String login;
        private String firstName;
        private String lastName;

        public User(String login, String firstName, String lastName) {
            this.login = login;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLogin() {
            return login;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }


    public static void process(Account account) {
        try {
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println(account.getCode());
            System.out.println(account.getBalance());

            owner.ifPresent(o -> {
                System.out.println(o.getLogin());
                System.out.println(o.getFirstName());
                System.out.println(o.getLastName());
            });

        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }
}
