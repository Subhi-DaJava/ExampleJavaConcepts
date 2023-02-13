package static_instance_methods.static_member.tests.test1;

/**
 * Lucy developed a library class that contains the main constants and methods for all projects in her company,
 * but, unfortunately, they have unclear names and meanings.
 *
 * Here is the class containing these constants and methods:
 *
 * Write code that prints values of the constants and the results of both methods in the following order: A_CONSTANT_TTT,
 * B_CONSTANT_QQQ, getMagicString(), convertStringToAnotherString("aa").
 * Each value must be printed in a new line.
 */
public class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println(ConstantsAndUtilities.A_CONSTANT_TTT);
        System.out.println(ConstantsAndUtilities.B_CONSTANT_QQQ);
        System.out.println(ConstantsAndUtilities.getMagicString());
        System.out.println(ConstantsAndUtilities.convertStringToAnotherString("aa"));
    }
}
