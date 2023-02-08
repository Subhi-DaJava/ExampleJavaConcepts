package threads_example.test_p2_quiz;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Question 4
 * Now that you have lots of telescopes, the astronomers have decided that it's time to do some science.
 * They would like to find all stars within .1 solar masses of the Sun.
 * This means that you need to find all stars in your fake dataset with a solar mass greater than  0.9.
 * Question :
 * You can paste this in  JShell  and call MassFinderTask.main(null) to start it.
 * Alternatively, compile and run it using your preferred method. As our astronomer friends have found, this always prints out 0.
 * <p>
 * Which of the following would still deconstruct ForkJoinTasks and solve it correctly?
 * Pick an answer that also correctly explains why. Remember that in an expanding universe, you want to easily scale up to handle larger datasets.
 */
public class MassFinderTask extends RecursiveTask<Integer> {

    public static class Star {
        // For prototyping. Don't break encapsulation in real code.
        public String name;
        public Double solarMasses;

        public Star(String name, Double solarMasses) {
            this.name = name;
            this.solarMasses = solarMasses;
        }
    }

    public static class FakeStarListFactory {
        // make a list of 2000 fake stars
        public static List<Star> make() {
            List<Star> stars = IntStream.range(0, 2000).
                    // Create "planet:n" with a random earth mass
                            mapToObj(n -> new Star("Star-" + n, Math.random())).
                    // Create a list with a mutable reduction
                            collect(Collectors.toList());
            return stars;
        }
    }

    private List<Star> starList;
    private Double minimumMass;

    public MassFinderTask(List<Star> starList, Double minimumMass) {
        this.starList = starList;
        this.minimumMass = minimumMass;
    }

    @Override
    public Integer compute() {
        // Base Case
        if (starList.size() == 1) {
            if (starList.get(0).solarMasses >= minimumMass) {
                return 1;
            }
            return 0;
        }
        // code origin
      /*  if (starList.size() == 0) {
            return 0;
        }*/


        // General case
        MassFinderTask left = new MassFinderTask(
                starList.subList(0, starList.size() / 2),
                minimumMass);

        MassFinderTask right = new MassFinderTask(
                starList.subList(starList.size() / 2, starList.size()),
                minimumMass);

        left.fork();
        right.fork();
        return left.join() + right.join();
    }

    public static void main(String[] args) {
        ForkJoinPool pool = ForkJoinPool.commonPool();
        Integer numberOfMatches = pool.invoke(
                new MassFinderTask(FakeStarListFactory.make(), 0.9));
        System.out.println(numberOfMatches);
    }
}
