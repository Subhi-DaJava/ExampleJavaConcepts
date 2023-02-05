package threads_example.blocking_queue.unbounded_queues;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

public class UnboundedQueueNonBlockingRemove {
    public static void main(String[] args) throws InterruptedException {
        // Create a queue
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        // Now create a thread that adds data to this 999 times
        Thread producer = new Thread( ()->IntStream.range(0,999).forEach(n -> queue.add(n)));

        System.out.println("before producer starting, producers' size: " + queue.size());
        producer.start();
        System.out.println("producers' size at starting point: " + queue.size());
        System.out.println("producers' size just after producer starting: " + queue.size());

        Thread consumer = new Thread(
                () -> IntStream.range(0,1000).forEach((value) -> {
                    // Wrap the queue.take() call in a try-catch for a checked InterruptedException.
                    try {
                        System.out.println( "Calling take() on queue.");
                        // create a consumer that calls the blocking take() and
                        // see how well it copes with getting called as many times
                        // Call queue.take() to consume from the queue. If the queue is empty,
                        // this will block until there is something for the consumer thread to fetch back.
                        System.out.println("before take method, producers' size: " + queue.size());
                        int item = queue.take();
                        System.out.println("Got back " + item);

                        System.out.println("after take method, producers' size: " + queue.size());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }));
        System.out.println("consumer's state before starting: " + consumer.getState());
        consumer.start();
        System.out.println("consumer's state just start: " + consumer.getState());
        System.out.println("producers' size in process: " + queue.size());
        System.out.println("producer's state at starting process: " + producer.getState());
        System.out.println("consumer's state in process: " + consumer.getState());
        // Call queue.take() to consume from the queue. If the queue is empty,
        // this will block until there is something for the consumer thread to fetch back.
        queue.add(1022);
        System.out.println("consumer's state in process: " + consumer.getState());
        System.out.println( "producer's state in process: " + producer.getState());
        System.out.println("producers' size at end: " + queue.size()); // 1


        Thread.sleep(2000);
        System.out.println("consumer's state in process: " + consumer.getState());
        System.out.println("consumer's state in process: " + producer.getState());

    }
}
