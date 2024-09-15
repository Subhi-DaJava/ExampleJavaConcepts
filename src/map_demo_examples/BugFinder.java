package map_demo_examples;

import java.util.HashMap;
import java.util.Map;

/**
 *  The unexpected behavior occurs because modifying a key after inserting it into a HashMap changes its hash code (key1.append("_modified")),
 *  making it impossible for the map to find the original "key" and retrieve the associated value, then return"null" value.
 */
public class BugFinder {
    public static void main(String[] args) {
        Map<StringBuilder, String> map = new HashMap<>();

        StringBuilder key1 = new StringBuilder("key1");
        StringBuilder key2 = new StringBuilder("key2");

        map.put(key1, "value1");
        map.put(key2, "value2");

        // Modifying the key after putting it into the map
        key1.append("_modified");

        // Attempt to retrieve values
        System.out.println("Value for key1: " + map.get(key1)); // value1
        System.out.println("Value for new key: " + map.get(new StringBuilder("key1_modified"))); // null
    }
}
