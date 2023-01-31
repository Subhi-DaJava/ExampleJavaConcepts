package strings;

import java.util.Scanner;

/**
 * concatStrings. The method should concat two strings and avoid NPE.
 * <p>
 * If both of the strings are null, you should return an empty string ("");
 * If only one string is null, you should return the other string.
 * <p>
 * input : a b -> output: ab  ; input: a null -> output: a  ; input null null -> output:
 */
public class NPE_Example {
    public static String concatStrings(String str1, String str2) {
        if (str1 == null && str2 != null) {
            return str2;
        }
        if (str2 == null && str1 != null) {
            return str1;
        }
        if (str1 == null) {
            return "";
        }
        return str1.concat(str2);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

        System.out.println(concatStrings(str1, str2));
    }
}
