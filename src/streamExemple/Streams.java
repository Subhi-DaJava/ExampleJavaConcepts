package streamExemple;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) throws IOException {
        // 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out :: print); // 123456789
        System.out.println();

        System.out.println("************************************** Skip ******************************************");
        // 2. Integer Stream skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.print(x)); // 6789 //lambda expression
        System.out.println();
        // 3. Integer Stream sum
        System.out.println("************************************** Sum ******************************************");
        System.out.println("Sum is " + IntStream
                .range(1, 10)
                .sum()); // 45
        System.out.println();

        // 4. Stream.of, sorted and findFirst
        System.out.println("************************************** Sorted & FindFirst ******************************************");
        Stream.of("Ava", "Anri", "Alberto", "Abdullah")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println); // Abdullah

        // 5. Stream from Array, sort, filter and print
        System.out.println("************************************** Array, sort, filter and print ******************************************");
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Amanda", "Hans", "Shivika","Xavier", "Abdullah", "Barat", "Sajide"};
        Arrays.stream(names) // same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println); // Sajide,Shivika

        // 6. Average of square of an int array
        System.out.println("************************************** Array, sort, filter and print ******************************************");
        Arrays.stream(new int[] {2,4,6,8,10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println); // 44.0

        // 7. Stream from list, filter and print
        System.out.println("************************************** List, filter & print ******************************************");
        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Amanda", "Hans", "Shivika","Xavier", "Abdullah", "Barat", "Sajide", "Sara", "Jim");
        people.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .sorted()
                .forEach(System.out::println); // abdulla, al, amanda, ankit

        // 8. Stream rows from text file, sort, filter, and print
        System.out.println("************************************** Text file, Sort & Print ******************************************");
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 12)
                .forEach(System.out::println);
        bands.close();

        // 9. Stream rows from text file and save to List
        System.out.println("************************************** Text file, Save to List ******************************************");
        List<String> bands2 = Files.lines(Paths.get("bands.txt"))
                .filter(x -> x.contains("Squ"))
                .collect(Collectors.toList());
        bands2.forEach( x -> System.out.println(x));

        // 10. Stream rows from CSV file and count
        System.out.println("************************************** CSV file and count ******************************************");
        Stream<String> rowsl = Files.lines(Paths.get("data.txt"));
        int rowCount = (int)rowsl
                .map(x -> x.split(","))
                .filter(x -> x.length == 3 )
                .count();
        System.out.println(rowCount + " row."); // 5 row.
        rowsl.close();

        // 11. Stream rows from CSV file, parse data from rows.
        System.out.println("***************************************** Parse data from rows **************************************************");
        Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
        rows2
                .map( x-> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
        rows2.close();

        // 12. Stream rows from CSV file, store fields in HashMap
        System.out.println("***************************************** Store fields in HashMap **************************************************");
        Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
        Map<String, Integer> map = new HashMap<>();

        map = rows3
                .map( x -> x.split(","))
                .filter( x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        // 13. Reduction - sum
        System.out.println("***************************************** Reduction - Sum **************************************************");
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b); // 0.0 + a then a + b
        System.out.println("Total = " + total); // Total = 13.600000000000001

        // 14. Reduction - summary statistics
        System.out.println("***************************************** Reduction - Summary Statistics **************************************************");
        IntSummaryStatistics summary = IntStream.of(7, 1, 5 ,3, 6, 8, 6 )
                .summaryStatistics();
        System.out.println(summary); // IntSummaryStatistics{count=7, sum=36, min=1, average=5,142857, max=8}
    }
}
