package threads_example.count_down_latch;

import java.util.concurrent.CountDownLatch;

/**
 * Countdown Latch
 * Java's concurrency framework allows you to do this using the CountDownLatch.
 * A CountDownLatch provides the countDown() method, so that each thread can call this when it's completed its work.
 * A thread waiting for those threads can call await() to block on them.
 *
 * CountDownLatch is a synchronizer, which allows your code to wait for one or more threads to complete the execution of a critical section.
 *
 * CREATE: A parent thread creates a CountDownLatch to share with child processes.
 * It passes the number of processes that you wait upon to the CountDownLatch constructor.
 * For instance, you might pass it a value of 4, if you had four files to process.
 *
 * COUNTDOWN: Each thread doing the actual work, calls latch.countDown() to signal that it has completed its work.
 *
 * AWAIT: The parent thread waits for the CountDownLatch to reach zero, by calling latch.await().
 * This puts the thread in a WAIT state until the workers have completed.
 *
 * Recap:
 * java.util.concurrent.CountDownLatch lets you create an object that allows a thread to share work with other threads and wait for them to complete.
 *
 * A CountDownLatch has a counter associated with it, which you can set when you call its constructor. Set this to the number of threads you want to wait on.
 *
 * Each thread you want to wait on is given the same instance of CountDownLatch and is expected to call countDown() on it when it has finished processing.
 * Calling this decrements the counter of the latch by one.
 *
 * You can then have another thread call  await()  on the latch and block until the counter reaches 0.
 * This should signify that you're ready to start working on the next part of the solution, unblocking the waiting thread.
 */
public class Airplane {
    public static void main(String[] args) throws InterruptedException {
        Integer CAPACITY_OF_AEROPLANE = 3;
        CountDownLatch boardingGroup = new CountDownLatch(CAPACITY_OF_AEROPLANE);
        // Check the count on the latch
        System.out.println("before: " + boardingGroup.getCount());

        // passangers disembark
        (new Thread(()->boardingGroup.countDown())).start();
        System.out.println(boardingGroup.getCount()); // 3

        // boardingGroup.await(); blocking, restart app.
        // If you call boardingGroup.await() with JShell or console, it should block. You can unblock it by hitting "CTRL-C".

        (new Thread(()->boardingGroup.countDown())).start();
        System.out.println(boardingGroup.getCount()); // 3 or 2

        (new Thread(()->boardingGroup.countDown())).start();
        System.out.println(boardingGroup.getCount()); // 2 or 1 or 3

        // wait for each passangers to disembark
        // It should let you through and produce a new JShell prompt
        boardingGroup.await();
        // Check the count on the latch
        System.out.println("after: " + boardingGroup.getCount()); // 0
    }
}
