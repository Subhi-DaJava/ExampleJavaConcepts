package threads_example.test_p2_quiz;

import java.io.IOException;
import java.util.concurrent.Semaphore;

/**
 * Create TelescopeOrderService with Question 3
 * Someone on your team creates a TelescopeOrderService to order those free telescopes.
 * It watches out for the IOExceptions, which sometimes happen when ordering a telescope. Here's the code.
 * The code gets stuck from time to time.
 * <p>
 * You can try this out for yourself by starting JShell and pasting the code; although, you might have to call it several times. (DONE)
 * You can then create an instance and call it with different star names. i.e: tos.orderATelescope("Sirius")  -> java.io.IOException: Simulated failure
 * You might have to hit ctrl-c if you get stuck while trying this out.
 */
public class TelescopeOrderService {

    public static void main(String[] args) throws IOException, InterruptedException {
        Semaphore semaphore1 = new Semaphore(1);
        TelescopeOrderService telescopeOrderService = new TelescopeOrderService(semaphore1);
        telescopeOrderService.orderATelescope("Sirius");
        telescopeOrderService.orderATelescope("Sirius");
        telescopeOrderService.orderATelescope("Sirius");
    }

    // A client which will occasionally fail
    public static class ShopClientSimulation {
        public static void orderTelescope(String discount)
                throws IOException {

            if (Math.random() > 0.1) {
                throw new IOException("Simulated failure");
            }
        }
    }

    private Semaphore semaphore;

    public TelescopeOrderService(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void orderATelescope(String starName) throws InterruptedException, IOException {
        try {
            semaphore.acquire();
            ShopClientSimulation.orderTelescope(starName);
        } catch (InterruptedException | IOException e) {
            // handle the exception
            e.printStackTrace();
        } finally {
            // always release our semaphore
            semaphore.release();
        }
    }
}
/*
Remove the  catch  block and change the method declaration to
public void orderATelescope(String starName) throws InterruptedException, IOException {
 */