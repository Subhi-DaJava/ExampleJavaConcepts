package threads_example.cocurrent_hash_map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        // Create a thread that counts to a large number and updates a key with the value "last_number"
        Thread mutator1 = new Thread(() -> IntStream.range(0, 1_000_000).forEach((n) -> map.put("last number", n)));
        Thread mutator2 = new Thread(() -> IntStream.range(800_000, 1_400_000).forEach(n -> map.put("last number", n)));

        Thread accessor = new Thread(() -> IntStream.range(0, 300).forEach(n -> System.out.println(map.get("last number"))));

        System.out.println("mutator1 state: " + mutator1.getState());
        System.out.println("mutator2 state: " + mutator2.getState());
        System.out.println("accessor state: " + accessor.getState());

        System.out.println("before process: " + map.get("last number"));

        mutator1.start();
        mutator2.start();
        accessor.start();

        System.out.println("mutator1 state: " + mutator1.getState());
        System.out.println("mutator2 state: " + mutator2.getState());
        System.out.println("accessor state: " + accessor.getState());

        System.out.println("after process: " + map.get("last number"));




    }
}
