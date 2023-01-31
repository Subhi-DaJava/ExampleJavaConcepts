package strings;

/**
 * Appending values to a string
 * It's possible to add values of different types to a string. The value will be automatically converted to a string.
 */
public class StringAppend {
    public static void main(String[] args) {
        String str = "string" + 147 + false; // the result is "string147false"
        System.out.println(str);

        System.out.println("**********************************************************");
        String shortString = "str";
        int number = 100;

        String result1 = shortString + number + 50; // the result is "str10050"
        String result2 = number + 50 + shortString; // what is the result2? 150str
        // The value of result2 will be 150str, because, first, we calculate the sum of number and 50 and then concat it with str.
        // The order of operations is important.
        System.out.println(result2);
    }
}
