package threads_example.test_p2_quiz;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FreeTelescopeGrabber freeTelescopeGrabber = new FreeTelescopeGrabber();

        CompletableFuture completableFuture = freeTelescopeGrabber.orderTelescopes();
        completableFuture.get();

    }
}
