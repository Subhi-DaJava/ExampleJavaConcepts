package inheritance.pet_cat;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setBirthDate(LocalDateTime.now());
        Cat cat = new Cat();
        cat.name = "Arislan";
        cat.setBirthDate(pet.getBirthDate());

        System.out.println(cat.getName());
        System.out.println(cat.name);
        System.out.println(cat.getBirthDate());
        System.out.println(pet.getBirthDate());

    }
}
