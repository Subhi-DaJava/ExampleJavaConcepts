package threads_example.test_p2_quiz;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Question 1
 * To order a telescope, someone needs to call the method with a star's name and a telescope argument. Eg.,
 * client.buy(star.name, "telescope")
 * <p>
 * They tried to implement a solution that would split the list of planets in two and kick-off two asynchronous CompletableFuture,
 * which loop through their respective lists and order telescopes. It hasn't worked. You've been told that it only seems to be looping through one list at a time.(DONE)
 *
 * Question 2
 * The team of bargain-loving astronomers receives a notification from the store warning that you're making too many requests to their platform.
 * While they welcome your business, for a short amount of time,
 * they require you to restrict your application so that it only makes one request at a time on their service.
 * Their longer-term plan is to gradually increase the number of concurrent orders that each customer can make.
 *
 * Given this information,
 * which of the following changes would limit your application to ONE ORDER at a time AND require changing a single argument if you need to modify this limit?
 */
public class FreeTelescopeGrabber {
    private static final String ITEM = "telescope";
    private AstronomyShopClient client = new AstronomyShopClient();
    private static final List<Star> STAR_LIST = FakeStarListFactory.make();
    // add this code for Question 2
    // private static final Integer CONCURRENT_REQUEST_LIMIT = 1;
    // private CountDownLatch requestLatch = new CountDownLatch(1);
    // lock
    //private static final ReentrantLock requestLock = new ReentrantLock();

    private static final Integer CONCURRENT_REQUEST_LIMIT = 1;
    private Semaphore requestControlSemaphore =
            new Semaphore(CONCURRENT_REQUEST_LIMIT);
    public CompletableFuture orderTelescopes() {
        // Split our list in 2
        List<Star> leftList = STAR_LIST.subList(
                0, STAR_LIST.size() / 2);

        List<Star> rightList = STAR_LIST.subList(
                STAR_LIST.size() / 2, STAR_LIST.size());

        // Code origin
        /*
        // Submit orders for both sides of the list
        return CompletableFuture.allOf(
            CompletableFuture.runAsync(
                ()->orderWithDiscountCodes(leftList)
            ).thenRun(
                ()->orderWithDiscountCodes(rightList)
            )
        );
         */

        // Submit orders for both sides of the list
        return CompletableFuture.allOf(
                CompletableFuture.runAsync(
                        ()-> {
                            try {
                                orderWithDiscountCodes(leftList);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                ),
                CompletableFuture.runAsync(
                        ()-> {
                            try {
                                orderWithDiscountCodes(rightList);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                )
        );
        /*
        // Submit orders for both sides of the list
    CompletableFuture left =
        CompletableFuture.supplyAsync(()->leftList).
        thenAcceptAsync(
            (leftList)->orderWithDiscountCodes(leftList));

    CompletableFuture right =
        CompletableFuture.supplyAsync(()->rightList).
        thenAcceptAsync(
            (rightList)->orderWithDiscountCodes(rightList));

    return CompletableFuture.allOf( left, right );
         */
        /*
        * // Submit orders for both sides of the list
        return CompletableFuture.anyOf(
            CompletableFuture.runAsync(
                ()->orderWithDiscountCodes(leftList)
            ),
            CompletableFuture.runAsync(
                ()->orderWithDiscountCodes(rightList)
            )
        );*/
    }
    // origin code for Question 1
    /*private void orderWithDiscountCodes(List<Star> stars) {
        // Use the client to order a free telescope
        // using each star as a discount code
        for (int index = 0; index < stars.size(); index++) {
            client.buy(stars.get(index).name, ITEM);
        }
    }*/

    // Question 2
    private void orderWithDiscountCodes(List<Star> stars) throws InterruptedException {
        // Use the client to order a free telescope
        // using each star as a discount code
        for (int index = 0; index < stars.size(); index++) {
            try {
                //requestLock.lock();
                requestControlSemaphore.acquire();
                client.buy(stars.get(index).name, ITEM);
                requestControlSemaphore.release();
            } finally {
                // requestLatch.countDown();
                // requestLock.unlock();
            }
           //requestLatch.await();
        }
    }
}
