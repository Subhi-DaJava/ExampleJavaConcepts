package inheritance.person_client_employee;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * Create an object of the Programmer class and fill the inherited fields using the inherited setters.
 * To read the values of the fields, we can use inherited getters.
 */
public class Main {
    public static void main(String[] args) {
        ProgrammerSubclassFromEmployeeSuperClass programmer = new ProgrammerSubclassFromEmployeeSuperClass();
        programmer.setName("Subhi Uyghur");
        programmer.setYearOfBirth(1933);
        programmer.setAddress("11 Rue de la Liberté");
        programmer.setStartDate(LocalDateTime.now());
        programmer.setSalary(25_000L);
        programmer.setProgrammingLanguages(new String[]{"Java", "Python", "Javascript"});

        System.out.println(programmer.getName());
        System.out.println(programmer.getStartDate());
        System.out.println(programmer.getAddress());
        System.out.println(Arrays.toString(programmer.getProgrammingLanguages()));
    }
}
