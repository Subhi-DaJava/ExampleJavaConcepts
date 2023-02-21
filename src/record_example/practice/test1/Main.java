package record_example.practice.test1;

import java.util.Scanner;

/**
 * Application
 * Override the default getters in the Player record. The getter for username should return the username in uppercase while the getter for email should return it in lowercase.
 * <p>
 * Sample Input 1:
 * <p>
 * Diamond Diamond@Example.com
 * Sample Output 1:
 * <p>
 * DIAMOND:diamond@example.com
 */
record Player(String username, String email) {
    public String username() {
        return username.toUpperCase();
    }

    public String email() {
        return email.toLowerCase();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner.next(), scanner.next());
        System.out.println(player.username() + ":" + player.email());
    }
}
