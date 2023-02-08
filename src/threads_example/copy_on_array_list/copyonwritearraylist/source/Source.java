package threads_example.copy_on_array_list.copyonwritearraylist.source;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.stream.IntStream;

/**
 * We're going to create a CopyOnWriteArrayList called "source",
 * and put some data in it. We'll then start looping through that "source data" to copy it into another list called "target".
 * While copying that data, we'll also add lots of new data to the "source" - at the same time. What do you think will happen?
 *
 * Once you start looping over the iterator of CopyOnWriteArrayList,
 * you're guaranteed a consistent state reflecting the point at which you started looping.
 * It results in safer and more predictable software and fewer bugs.
 *
 * Even better, since you're not synchronizing to achieve this, it means less blocking,
 * which means more efficient code! But only if your design calls for a "shared mutable array list"!
 */
public class Source {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Create a CopyOnWriteArrayList of type integer
        CopyOnWriteArrayList<Integer> source = new CopyOnWriteArrayList<>();

        // Add the number 7 in there
        source.add(7);

        // create a second list which we'll copy all of this data into. That is the one value, 7
        CopyOnWriteArrayList<Integer> target = new CopyOnWriteArrayList<>();

        // Create a thread that loops over "source" and copies each value into data. For each value in source,
        // it also adds another 100 numbers to "target" - changing the source list.

        // creates an iterator from the list source and starts looping through its data.
        // In this case, the only data in there at this time is the value 7.
        CompletableFuture.runAsync(() -> source.forEach((n) -> {
            System.out.println("only one: " + n);
            // adds every number from 100 to 199 into the source list.
            // This runs once for each value considered in our outer .forEach() loop. So that's once.
            IntStream.range(100, 200).forEach(m -> source.add(m));
            // runs for each value n provided by the iterator of source. Since there is only one value in source,
            // this at least copies the number 7. But what about all those other values we added in Step 2 (line 32)?
            // Target only contains the number 7. The reason for this is that the iterator we used was created from a list that only had the value 7 in it.
            target.add(n);
        })).get();

        // It's got all one hundred numbers, as well as the original 7.
        System.out.println(source);
        // "Target" only contains the number 7. The reason for this is that the iterator we used was created from a list that only had the value 7 in it.
        System.out.println(target);

    }
}
