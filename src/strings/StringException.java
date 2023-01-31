package strings;

/**
 * NullPointerException
 *
 * StringIndexOutOfBoundsException
 */
public class StringException {
    public static void main(String[] args) {
        String str1 = null;
        int length = str1.length(); // it throws NullPointerException

        System.out.println("*************************************************");
        String str2 = "str";
        // it throws StringIndexOutOfBoundsException because indexing starts with 0 (access a non-existing character by an index then this exception occurs)
        char c = str2.charAt(3);
    }
}
