package strings;

/**
 * isEmpty() returns true if the string is empty, otherwise – false;
 * toUpperCase() returns a new string in uppercase;
 * toLowerCase() returns a new string in lowercase;
 * startsWith(prefix) returns true if the string starts with the given string prefix, otherwise, false;
 * endsWith(suffix) returns true if the string ends with the given string suffix, otherwise, false.
 * contains(...) returns true if the string contains the given string or character;
 * substring(beginIndex, endIndex) returns a substring of the string in the range: beginIndex, endIndex - 1, [begin, end);
 * replace(old, new) returns a new string obtained by replacing all occurrences of old with new that can be chars or strings.
 * trim() returns a copy of the string obtained by omitting the leading and trailing whitespace.
 * Note that whitespace includes not only the space character, but mostly everything that looks empty: tab, carriage return, newline character, etc.
 *
 * <a herf="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">document</a>
 */
public class StringMethod {
    public static void main(String[] args) {
        String text = "I am A string";

        boolean empty = text.isEmpty(); // false

        String textInUpperCase = text.toUpperCase(); // "I AM A STRING"

        boolean startsWith = textInUpperCase.startsWith("I"); // true

        /* replace all space characters with empty strings */
        String noSpaces = textInUpperCase.replace(" ", ""); // "IamAstring"

        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";
        System.out.println(textWithWhitespaces);
        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"
        System.out.println(trimmedText);
    }
}
