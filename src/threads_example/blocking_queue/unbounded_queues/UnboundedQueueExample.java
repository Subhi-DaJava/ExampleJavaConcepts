package threads_example.blocking_queue.unbounded_queues;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

/**
 * You should see this consume every item from the queue, and then result in a "NoSuchElementException". This is because we used the "non-blocking remove" method.
 */
public class UnboundedQueueExample {
    public static void main(String[] args) {
        // Create a queue
        LinkedBlockingQueue<Integer> q = new LinkedBlockingQueue<>();
        // Step 3: Now create a thread that adds data to this 999 times
        Thread producer = new Thread( ()-> IntStream.range(0,999).forEach(n -> q.add(n)));
        // Step 4: Create a thread to consume from the queue more items from the queue than are present
        // This should consume one more item from the queue than you've added.
        Thread consumer = new Thread( () -> IntStream.range(0,1000).forEach( n -> System.out.println("Got " + q.remove())));
        // Step 5: Startup the producer thread
        producer.start();
        // Check the queue size: the value of 999
        q.size();
        // Now start up the consumer and see what happens
        consumer.start();
        // You should see this consume every item from the queue, and then result in a "NoSuchElementException".
        // This is because we used the "non-blocking remove" method.
        q.size();
    }
}
