package threads_example.test_p2_quiz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The factory class for creating a list with a sample set of 2000 stars.
 */
public class FakeStarListFactory {
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
class ShowAllStars {
    public static void main(String[] args) {

        for (Star star: FakeStarListFactory.make()) {
            System.out.println(star.toString());
        }
    }
}
