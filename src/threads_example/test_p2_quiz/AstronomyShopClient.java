package threads_example.test_p2_quiz;

/**
 * Question 1
 * You are called in by a crack team of budget astronomers who want to take advantage of a special offer and get some free telescopes.
 * They need to concurrently send the names of stars as discount codes to an online shop, which is giving away free telescopes.
 *
 * To keep things fair, the store only allows two purchases at a time from any customer.
 * You've been asked to modify some code to use the following class's  buy(discountCode, item)  method to purchase a telescope item.
 */
public class AstronomyShopClient {
    public void buy(String discountCoude, String item) {
        System.out.println("Ordered a telescope");
    }
}
