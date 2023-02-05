package modifiers.protected_modifier.answer_tiger.tiger.test;

import modifiers.protected_modifier.org.subhi.test.Tiger;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiggy");

        // tiger.run(); run() protected, compile error
    }
}
