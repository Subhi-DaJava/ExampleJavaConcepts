package threads_example.futre;

import java.util.concurrent.*;

/**
 * Pythagoras' famous theorem of a²+b²=c².
 */
public class Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer a = 3, b = 4;
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // Produce the values for a^2 + b^2
        //  First farm out the calculation of a² and b².
        java.util.concurrent.Future<Integer> aSquaredFuture = executorService.submit(() -> a * a);
        java.util.concurrent.Future<Integer> bSquaredFuture = executorService.submit(() -> b * b);
        // Wait for the values to pass on to our Consumer
        // Wait for the Futures, so you can pass them onto the next step.
        // This is manually synchronizing code and waiting for the results to be ready. You're telling the thread to block and wait for a result, by calling get().
        Integer aSquared = aSquaredFuture.get();
        Integer bSquared = bSquaredFuture.get();
        // Consume and calculate Pythagoras' a^2+b^2=c^2
        // Consume a² and b² now that they are passed. Use it to calculate c².
        Double c = Math.sqrt(aSquared + bSquared); // 5.0
        System.out.println(c);

        executorService.shutdownNow();

    }
}
