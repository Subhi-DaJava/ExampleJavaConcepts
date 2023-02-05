package threads_example.blocking_queue.bounded_queues;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * What can you do if your application's producers produce more data than your consumers can keep up with?
 * Perhaps the producers spit out 1,000 temperature samples every second,
 * and two consumers each consume 500 temperatures samples every second.
 * You might want to slow down your producers so that your queues don't grow indefinitely and
 * never exceed a queue size of 500. It allows your consumers to catch up.
 *
 * If you want to ensure that you don't overwork your threads,
 * you can make a decision for consumers to be spared some effort by slowing your producers down now and then.
 * Do this by setting a bound on the queue in this way. That is a maximum size it can ever get to,
 * also known as its maximum depth.
 *
 * Note: Any attempt to add() items beyond this limit result in an "IllegalStateException"
 */
public class BoundedQueue {
    public static void main(String[] args) throws InterruptedException {
        // pass the maximum size of your queue to the constructor
        // Set the bounding size of the queue to 1, by passing it this value in the constructor
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>(1);

        // Add a letter to the queue
        queue.add("a");
        // Attempt to add a second item to the queue. As you can see,
        // this gets followed by an "IllegalStateException" pointing out the "queue is full"
        queue.add("b"); // Exception in thread "main" java.lang.IllegalStateException: Queue full

        /*
        Do my threads have to catch "IllegalStateExceptions" when adding to bounded queues?
        No. When writing multithreaded applications, it is better to use "put()" when adding to a queue.
        queue.put("b");
        put() blocks until it can add an item to the queue. This adds backpressure to your queue,
         slowing down producers as they attempt to add new data.

         Producers won't be able to add this data until there is space on the queue.
         It's a great way to allow your consumers to keep up with your producers.
         */
    }
}
