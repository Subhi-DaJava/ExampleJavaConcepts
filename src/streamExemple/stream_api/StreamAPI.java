package streamExemple.stream_api;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The processing of a stream consists of several steps:
 * First, construct a stream.
 * There are various methods for this. One of the simplest is by calling the .stream() method on an existing collection,
 * such as a list. In the previous chapter, we used Java's Files API to return a stream of all rows in a file, by calling Files.lines().
 * <p>
 * Next, invoke intermediate operations.
 * These are steps you go through using lambdas and parts of the Stream API to filter, transform, and manipulate items in your stream.
 * <p>
 * Finally, invoke a terminal operation.
 * This method takes the output from your stream (or streams) and reduces them into a single result or behavior.
 * There are several types of terminal operations you can read about in more detail, but we'll focus on collect().
 * <p>
 * Note :
 * collect() is a mutable reduction where the final results update as more data trips in from your stream.
 * Mutability describes something that can change. Reduction describes the process of turning a complex set of results into a simpler result.
 */
public class StreamAPI {
    public static void main(String[] args) {
        double averageEarthMasses =
                Stream.of("1.5", "1.6", "1.8", "", "2.5"). // Using Stream.of, create a stream with three real numbers as strings.
                        filter(row -> !row.equals("")). // An intermediate operation using the Stream.filter() method of the Stream API to return all non-empty rows; that is, those where !row.equals("") is true.
                        map(Double::parseDouble).
                        collect(Collectors.averagingDouble(n -> n)); // (1.5 + 1.6 + 1.8 + 2.5) / 4

        System.out.println(averageEarthMasses);

    }

    /*
     * line 28
     * An intermediate operation using the map method of the Stream API to convert a value to a double.
     * As we're using an existing method rather than writing a lambda, pass it a symbol to the static method,
     * Double.parseDouble, from Java's double class. To pass it in place of lambda, reference the class as usual, but place a "::" symbol before the method name.
     *
     * line 29
     * A terminal operation using Stream.collect to reduce the stream of doubles into a result.
     * Use the java.util.streams.Collectors class to reduce the result with its averagingDouble() method, which takes a lambda.
     * Pass it a lambda, which returns the argument given to it. This particular lambda, (n -> n),
     * is also known as an identity function since it returns the argument given to it.
     */
}
