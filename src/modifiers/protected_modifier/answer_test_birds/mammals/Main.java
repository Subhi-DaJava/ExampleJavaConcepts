package modifiers.protected_modifier.answer_test_birds.mammals;

import modifiers.protected_modifier.answer_test_birds.mammals.felines.Cat;
import modifiers.protected_modifier.test.birds.Bird;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mammal mammal = new Mammal();

        // cat.yell(); 'yell()' is not public in 'modifiers.protected_modifier.answer_test_birds.mammals.Mammal'. Cannot be accessed from outside package

        bird.fly();

        cat.motherChild();

        // mammal.sing(); Cannot resolve method 'sing' in 'Mammal'
    }
}
