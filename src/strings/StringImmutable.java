package strings;

/**
 * The output has To be ===> Java
 *
 * Why?
 * Because the string created in code is "IMMUTABLE" string
 * (The String Which CANNOT be changed once created )
 */
public class StringImmutable {
    public static String trickyQuestion(){
        String str = "Java";
        str.concat("Programming");
        return str;
    }

    public static void main(String[] args) {
        System.out.println(trickyQuestion());
    }
}
