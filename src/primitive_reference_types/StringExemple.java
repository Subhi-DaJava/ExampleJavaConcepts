package primitive_reference_types;

/**
 * Reference type : String, Assignment and Comparison
 * Unlike primitive types, a variable of a reference type can refer to a special null value that represents the fact that it is not initialized yet or doesn't have a value.
 */
public class StringExemple {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = s2;

        System.out.println(s1 == s2); // false
        System.out.println(s2 == s3); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true

        String str = null;
        System.out.println(str); // null
        str = "hello";
        System.out.println(str); // hello
    }
}
