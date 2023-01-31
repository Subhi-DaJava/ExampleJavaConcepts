package strings;

/**
 * A string literal is surrounded by a pair of double quotes
 * <p>
 * A string can represent a long character sequence (text). A string can have one or zero characters.
 * <p>
 * A string can be null. It means no value was assigned.
 * <p>
 * Another way to create a variable of String is by using the keyword new.
 */
public class CreateString {
    public static void main(String[] args) {
        String simpleString = "It is a simple string"; // a simple string
        System.out.println(simpleString);  // it prints "It is a simple string"

        String anotherString = "This is\na multiline\nstring"; // a string with escape sequences
        System.out.println(anotherString); // it prints the result in several lines

        System.out.println("******************************************");
        String strangeText = "aaaaaaaaaaa ggggggggddddddddddd qqqq ffff";

        String emptyString = ""; // empty String

        String s = "s"; // a string consisting of one character
        System.out.println("*****************************************************");
        String nullString = null; // it is null
        System.out.println(nullString);
        System.out.println("********************************************************");
        String str = new String("my-string"); // it creates an object and assigns it to the variable

        System.out.println("**********************************************");
        String multiLines = """ 
                sdsdfsdf
                sdfsds
                sdf
                s
                sf
                sf
                sf
                s
                """;
        System.out.println(multiLines);

    }
}
