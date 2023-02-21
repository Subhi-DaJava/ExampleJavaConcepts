package tostring_methode.practice.test4;

import java.util.Scanner;

/**
 * Account
 * There is a class named Account. It includes three fields: id, code and balance.
 * <p>
 * Override the method toString() in this class. The method should return a string representation of an instance of the Account.
 * <p>
 * Do not make the Account class public.
 * <p>
 * Example
 * <p>
 * Account{id=10, code='123-456-789', balance=2000}
 */
class Account {

    private long id;
    private String code;
    private Long balance;

    public Account(long id, String code, Long balance) {
        this.id = id;
        this.code = code;
        this.balance = balance;
    }

    // Override toString() here

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        long id = Long.parseLong(parts[0]);
        String code = parts[1];
        long balance = Long.parseLong(parts[2]);

        Object acc = new Account(id, code, balance);

        System.out.println(acc.toString());
    }
}
