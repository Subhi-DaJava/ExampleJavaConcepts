package strings;

/**
 * Two strings can be concatenated using the "+" operator or the concat method. Both approaches lead to the same results.
 */
public class ConcatString {
    public static void main(String[] args) {
        String firstName = "Java";
        String lastName = "String";

        // concatenation using the "+" operator
        String fullName1 = firstName + " " + lastName; // "Java String"

        // concatenation using the concat method
        String fullName2 = firstName.concat(" ").concat(lastName); // "Java String"
    }
}
