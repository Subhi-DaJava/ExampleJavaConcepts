package strings;

import java.util.logging.Logger;

public class StringValueStaticMethod {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(StringValueStaticMethod.class.getName());
        int x = 5;
        String str = "Hello";

        changeValues(x, str);

//        System.out.print("x: " + x);
//        System.out.print(", str: " + str);
        logger.info("x: 5, str: Hello");
    }

    public static void changeValues(int x, String str) {
        x = 10;
        str = "World";
    }

}
