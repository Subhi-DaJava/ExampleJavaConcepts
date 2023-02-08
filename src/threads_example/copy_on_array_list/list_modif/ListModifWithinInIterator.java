package threads_example.copy_on_array_list.list_modif;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Java will, therefore, protect you by throwing a ConcurrentModificationException when you're looping through a list.
 * Looping through a list involves using an iterator, which is the same as calling iterator() on a list directly.
 * Since this iterator protects you from yourself, it is known as a fail-fast iterator.
 */
public class ListModifWithinInIterator {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Space", "the", "final", "frontier"));
        for (String word : words) {
            System.out.println(word);
            // Java won't let you modify a list if you are already looping through it
            words.add("A new word"); // Exception in thread "main" java.util.ConcurrentModificationException
        }
    }
}
