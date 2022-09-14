package java_100_examples;

/**
 * Problem : Convert string to character array
 * Input : "String"
 * Output : S t r i n g
 */
public class Day_22 {
    public static void main(String[] args) {
        String str = "String";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        System.out.println("**************************************");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("***************************************");
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }

        for (char c : characters){
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println(characters);
    }
}
