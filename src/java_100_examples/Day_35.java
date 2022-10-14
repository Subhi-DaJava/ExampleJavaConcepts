package java_100_examples;

/**
 * Problem: length of the String = number of the letters/characters + the symboles and concatenation
 * Input : Hello Java world + friends
 * Output 17 and Hello Java world friends
 */
public class Day_35 {
    public static void main(String[] args) {
        int length;
        String str = "Hello Java world, ";
        String strConcat = "friends !";

        length = str.length();
        System.out.println("The length of this string : " + length);

        String newStr = str.concat(strConcat);

        System.out.println(str);
        System.out.println(strConcat);
        System.out.println(newStr);
    }
}
