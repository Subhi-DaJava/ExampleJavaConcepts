package threads_example.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * CompletableFutures are a special implementation of a future that allow you to connect the output of Futures task to the input of other Futures.
 * CompletableFutures can connect tasks using methods from the CompletionStage interface.
 * This allows you to create a chain from one CompletionStage to another. You can even specify if you want a stage to pass its output to the next stage.
 * As CompletableFutures are still Futures, they also provide a blocking get() method for a thread to block on and wait for the final result.
 * Using CompletableFutures removes the need to write your own code between each stage of concurrent processing.
 *
 * Pythagoras' famous theorem of a²+b²=c².
 * Note : To catch an exception thrown by a CompletableFuture,
 * chain on a call to exceptionally() and pass in a lambda to handle a throwable of type CompletionException.
 */
public class CompletableFutureEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Assign values to a and b
        Integer a = 3, b = 4;
        // Declare a variable into which you assign c's future
        CompletableFuture<Double> c =
                // Start constructing the pipeline of CompletionStages with a CompletableFuture to calculate a²
                // CompletableFuture.supplyAsync() allows you to create a CompletableFuture which has its output supplied to another CompletionStage.
                CompletableFuture.supplyAsync(() -> a * a).
                        // take the output of a² and combine it with the result of calculating b². Do this by calling the CompletionStage method thenCombine()
                        // thenCombine() takes two arguments.
                        // The first is another CompletableFuture to produce an output that can be combined with the previous Future.
                        // This will be used to calculate b²
                                thenCombine(CompletableFuture.supplyAsync(() -> b * b),
                                // thenCombine() takes a BiFunction as its second argument. You can think of this as a lambda that takes two arguments.
                                (aSquared, bSquared) -> Math.sqrt(aSquared + bSquared));
        // Call c.get() to get back your result. It's still a Future, so get blocks it until a result is ready.
        System.out.println("c = " + c.get());
    }
    /**
     * A BiFunction defines an interface for a class with only one method, which accepts two arguments.
     * Note that this is intentionally similar to a function interface. In this case, it finds the square root of a²+b².
     */
}
