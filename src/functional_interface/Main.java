package functional_interface;

public class Main {
    public static void main(String[] args) {
        FunctionalInterface anonymousMethod = (arg -> arg + arg * arg); // lambda expression
        // This should be solved by lambda as above
        System.out.println(anonymousMethod.doSomething(3d)); // 12
    }
}
