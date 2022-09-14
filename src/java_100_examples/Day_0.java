package java_100_examples;

/**
 * Problem : substring method ->
 * Input : "some string"
 * Output : "SomeString"
 *
 * Not yet
 */
public class Day_0 {
    public static void main(String[] args) {
        String str = "some string";
        String newStr = str.charAt(0) + str.substring(5);
        System.out.println(newStr);

    }
}
