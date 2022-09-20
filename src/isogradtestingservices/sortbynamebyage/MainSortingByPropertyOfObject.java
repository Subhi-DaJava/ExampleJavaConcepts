package isogradtestingservices.sortbynamebyage;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Trier le tableau d'objets Person (people) par leur propriété age puis par propriété name
 * Méthode 1 : Arrays.sort(people, (first, second) -> (first.getAge() != second.getAge()) ?
 *                                         (first.getAge() - second.getAge()) :
 *                                         (first.getName().compareTo(second.getName())));
 *
 * Méthode 2 : Comparator<Person> byAge = Comparator.comparing(Person::getAge);
 * Comparator<Person> byName = Comparator.comparing(Person::getName);
 *
 * Arrays.sort(people, byAge.thenComparing(byName));
 */
public class MainSortingByPropertyOfObject {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Person("PersonB", 20),
                new Person("PersonA", 25),
                new Person("PersonE", 25),
                new Person("PersonT", 20),
                new Person("PersonB", 18),
                new Person("PersonI", 20),
                new Person("PersonC", 18)};

        Comparator<Person> byAge = Comparator.comparing(Person::getAge);
        Comparator<Person> byName = Comparator.comparing(Person::getName);
        /*Trier le tableau par leur propriété age puis par propriété name*/
        Arrays.sort(people, byAge.thenComparing(byName));

        for(Person perp: people){
            System.out.println("" + perp + "<br />");
        }
    }
}
