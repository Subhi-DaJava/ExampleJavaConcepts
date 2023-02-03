package threads_example.completable_future;

import java.util.concurrent.CompletableFuture;

public class HiPerson {
    public static void main(String[] args) {
        // Create a CompletableFuture of type string:
        CompletableFuture<String> future = new CompletableFuture<>();
        System.out.println(future.isDone());
        // Declare that when it completes, you pass its output to another lambda
        // This causes the output of your future to be concatenated with "Hi " and printed to your terminal.
        // thenAccept((input) -> myLambda) takes the output passed from the previous CompletionStage and provides an input to the provided lambda.
        future.thenAccept((person) -> System.out.println("Hi " + person));
        // Force the CompletableFuture to complete with a value of Captain Crunchy.
        future.complete("Captain Crunchy");
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
    }
}
