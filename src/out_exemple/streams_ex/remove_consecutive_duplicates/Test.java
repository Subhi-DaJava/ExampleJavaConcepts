package out_exemple.streams_ex.remove_consecutive_duplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;


public class Test {
    public static void main(String... programingKT) {
        var list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);

        List<Integer> l = removeConsecutiveDuplicates(list);
        System.out.println(l);
    }

    public static List<Integer> removeConsecutiveDuplicates(List<Integer> list) {
        return IntStream.range(0, list.size())
                .filter(i -> i == 0 || !list.get(i).equals(list.get(i - 1)))
                .mapToObj(list::get)
               // .collect(Collectors.toCollection(ArrayList::new));
                .toList();
    }
}
