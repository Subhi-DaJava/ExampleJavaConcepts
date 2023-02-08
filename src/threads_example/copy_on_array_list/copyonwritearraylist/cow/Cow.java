package threads_example.copy_on_array_list.copyonwritearraylist.cow;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * As you can see, "fail-safe iterators" are not magic! So, they won't be able to guess at what you want your program to do.
 * If you had wanted that "outer for-loop" to reflect changes to the collection, you'd have to design your program differently.
 * Understanding how these iterators work is the first step to deciding how they affect the flow of your program.
 * Make sure you understand how using a CopyOnWriteArrayList affects your program before choosing to use one.
 * Like all your other concurrency constructs, your goal is to limit blocking. Only use it when you need it, or you'll slow your code down.
 */
public class Cow {
    public static void main(String[] args) throws InterruptedException {
        // Create a CopyOnWriteArrayList called cows. It contains Kala and Topaq.
        // Now create two threads that can use it. Iterating on a CopyOnWriteList creates a local copy for each iterator.
        List<String> cows = new CopyOnWriteArrayList<>(Arrays.asList("Kala", "Topaq"));

        // Thread 2 starts off seeing both values on the shared list.
        /*
         Thread 2 adds "Inek" to the end of the cows. This is reflected in the shared list of cows.
         Thread 1 can see this by calling cows.get(2), but you haven't told Thread 1 that there's another element.
         So its iterator won't take this into account, and it'll just iterate through the original list of two items.
         */
        Thread cow2 = new Thread(() -> {for (String cow:cows) {
            System.out.println("from Thread2: " + cow);
            cows.add("Inek");
        }});


        // Thread 1 also sees the same values on the shared and unmodified list.
        // Thread 1 starts to loop through the array and is guaranteed to only get back the current items in cows (i.e., kala and topaq).
        /*
        Even if Thread 1 adds "Mozay" to the list of cows, it won't be reflected.
        The iterator continues to use a copy of the list, as of the time at which you started looping.
        So, even if Thread 1 adds "Mozay" to the list, it is reflected by a value for cow returned by its current iterator.
         */
        Thread cow1 = new Thread(() -> {for (String cow:cows) {
            System.out.println("from Thread1: " + cow);
            cows.add("Mozay");
        }});

        System.out.println(cow1.getState());
        System.out.println(cow2.getState());

        cow2.start();
        cow1.start();

        Thread.sleep(3000);
        System.out.println(cow1.getState());
        System.out.println(cow2.getState());

        for (String cow:cows) {
            System.out.println(cow);
        }


    }
}
