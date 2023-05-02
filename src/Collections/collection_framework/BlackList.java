package Collections.collection_framework;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Blacklist
 * Has it ever bothered you when unknown people call you and try to impose their services? That can be annoying.
 *
 * Let's try to solve the problem by using a blacklist. You should implement the filterPhones method that returns only the phone numbers that are not on the blacklist.
 *
 * input 387-968-2999 505-468-5235 738-739-3272
 *       505-468-5235
 * output 387-968-2999 738-739-3272
 */
public class BlackList {
    public static Collection<String> filterPhones(Collection<String> phones,
                                                  Collection<String> blacklist) {
        // write your code here
   /*     for(String phoneNumber : phones) {
            for(String phoneNumberBanned : blacklist) {
                if(phoneNumber.equals(phoneNumberBanned)) {
                    phones.remove(phoneNumber);
                }
            }
        }*/

        for (String black : blacklist) {
            phones.remove(black);
        }
        return phones;
    }
}


class Main {
    public static void main(String[] args) {
        List<String> temps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Collection<String> phones = Arrays.asList(scanner.nextLine().split("\\s+"));
        Collection<String> blockList = Arrays.asList(scanner.nextLine().split("\\s+"));

        Collection<String> nonBlockedPhones = BlackList.filterPhones(
                new ArrayList<>(phones), new ArrayList<>(blockList));

        System.out.println(nonBlockedPhones.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
