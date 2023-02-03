package threads_example.completable_future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * The methods of a CompletionStage allow you to connect stages, but also declare a task that handles CompletionExceptions.
 * These exceptions are thrown when an unchecked exception occurs in a CompletionStage.
 * It connects to your chain of stages, using the .exceptionally(CompletionException e)  method.
 */
public class CompletableFutureException {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Object> cf = CompletableFuture.supplyAsync(() -> {
            throw new RuntimeException("Boooooooooooom");
        });

        cf.exceptionally((e) -> {
            e.printStackTrace();
            return "There is an exception has been handled!";
        });
        cf.get();
    }
}
