package tostring_methode.practice.test6;

/**
 * Users as strings
 * You are given a class named User. It has three string fields: login, firstName, lastName.
 * Override the method toString() in the class to return string representations of users.
 * <p>
 * The overridden method must return a string including all field-value pairs separated by commas.
 * <p>
 * Here is an example: "login=java,firstName=James,lastName=Gosling".
 * <p>
 * Sample Input 1:
 * <p>
 * java James Gosling
 * Sample Output 1:
 * <p>
 * login=java,firstName=James,lastName=Gosling
 */
public class User {
    public static void main(String[] args) {
        User user = new User("java", "James", "Gosling");
        System.out.println(user);
    }
    private String login;
    private String firstName;
    private String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "login=" + login +
                ",firstName=" + firstName +
                ",lastName=" + lastName;
    }
}
