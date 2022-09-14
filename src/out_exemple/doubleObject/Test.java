package out_exemple.doubleObject;

public class Test {
    static Double d1; // = 0.223 is ok, if not throw NPE.
    static int x = d1.intValue();

    public static void main(String[] args) {

        System.out.println("HELLO");
    }
}
