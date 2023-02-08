package threads_example.test_p2_quiz;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Question 6
 * You want to find the total sum of solar masses.
 * Which of the following creates a CompletableFuture that returns the average solar mass from a list of planets?
 * This should be a CompletableFuture instance which you can call  get()  on.
 */
public class StarMass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Star> starList = FakeStarListFactory.make();
        // one option
        CompletableFuture starMassSum = CompletableFuture.supplyAsync(() -> starList).
                thenApplyAsync(star_List -> star_List.stream().
                        mapToDouble(star -> star.solarMasses).
                        sum());
        System.out.println(starMassSum.get()); // 1006.5799271801176 or 986.8284885300576 or 1030.3509872236511

        // other option
        CompletableFuture starMassSum2 = CompletableFuture.completedFuture(
                starList.stream().mapToDouble(star->star.solarMasses).sum());
        System.out.println(starMassSum2.get()); // 976.6341920524955

        // another option
        /*CompletableFuture starMassSum3 = CompletableFuture.supplyAsync(starList).
                thenAcceptAsync((starList) ->
                        starList.stream().
                                mapToDouble(star->star.solarMasses).
                                sum());*/
        // last option
        /*CompletableFuture starMassSum4 =CompletableFuture.supplyAsync(starList).
                thenAcceptAsync((starList) ->
                        starList.stream().
                                mapToDouble(star->star.solarMasses).
                                sum()).get();*/
    }

}
