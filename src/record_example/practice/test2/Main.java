package record_example.practice.test2;

/**
 * A new record
 * Modify the record provided to have a name (String) and an address (String). Note that the order is important.
 *
 * Sample Input 1:
 *
 * Diamond
 * Unknown
 * Sample Output 1:
 *
 * Diamond has the address: Unknown
 */

import java.util.Scanner;

//modify this Record
record Person(String name, String address) {

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.nextLine(), scanner.nextLine());
        System.out.println(person.name() + " has the address: " + person.address());
    }
}

// code original
/*
import java.util.Scanner;

//modify this Record
record Person() {

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(scanner.nextLine(), scanner.nextLine());
        System.out.println(person.name() + " has the address: " + person.address());
    }
}
 */