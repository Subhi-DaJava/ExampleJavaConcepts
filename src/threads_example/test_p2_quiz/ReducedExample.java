package threads_example.test_p2_quiz;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

/**
 * Create ReducedExample class for Question 5
 * One of your collaborators has written a service that connects up to a space telescope and
 * returns a list of its three most recently observed stars.
 * She has written a ComputableFuture that needs to loop over this list and perform some operations on it.
 * Your code has another thread that needs to wait for this to finish before continuing.
 * <p>
 * Since the code isn't working, the two of you have produced this simplified representation of your code flow: (DONE)
 */
public class ReducedExample {
    public static void main(String[] args) throws Exception {
        ReducedExample reducedExample = new ReducedExample();
        reducedExample.simplifiedExample();
    }

    private CountDownLatch latch = new CountDownLatch(3);
    private List<Star> starsReturnedByService =
            FakeStarListFactory.make().subList(0, 3);

    // When run, this blocks and doesn't return. For some reason, the  waitingThread  gets stuck at  latch.await().
    public void simplifiedExample() throws Exception {
        // Create a thread which waits for us to finish looping
        Thread waitingThread = new Thread(
                () -> {
                    // wait for the latch
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Can do other processing now");
                }
        );

        // Loop through the list and then countDown
        waitingThread.start();
        CompletableFuture.runAsync(
                () -> {
                    for (int i = 0; i < 3; i++) {
                        // Process the list item and then countdown
                        System.out.println(i);
                        latch.countDown();
                    }
                }
        );
    }
    // code origin
    // When run, this blocks and doesn't return. For some reason, the  waitingThread  gets stuck at  latch.await().
/*    public void simplifiedExample() throws Exception {
        // Create a thread which waits for us to finish looping
        Thread waitingThread = new Thread(
                () -> {
                    // wait for the latch
                    latch.await();

                    System.out.println("Can do other processing now");
                }
        );

        // Loop through the list and then countDown
        CompletableFuture.runAsync(
                ()->{
                    for (int i=0; i<2; i++) {
                        // Process the list item and then countdown
                        latch.countDown();
                    }
                }
        );
    }*/
}
/*
The loop doesn't call countDown() 3 times, thus preventing latch.await() from unblocking.
 This means that the code remains blocked until countDown() is called a sufficient number of times.
 */