package java_methods_example.overloading;

/**
 * In the case where the method parameter type is not exactly the same as the type of the passed argument,
 * the compiler chooses the method that has the closest argument type in order of implicit casting.
 * Since all integer literals are treated as int by default, int will be the starting point. The closest one will then be long.
 */
public class OverloadingCasting {
    public static void main(String[] args) {
        print(100);
        print((short) 100);  // explicit casting
    }
    public static void print(short a) {
        System.out.println("short arg: " + a);
    }

    /*public static void print(int a) {
        System.out.println("int arg: " + a);
    }*/

    public static void print(long a) {
        System.out.println("long arg: " + a);
    }

    public static void print(double a) {
        System.out.println("double arg: " + a);
    }


}
