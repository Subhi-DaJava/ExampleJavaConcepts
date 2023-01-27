package class_path_example.class_path;

/**
 * JVM - Class Path
 * Practice without IDE and outside actual directory and don't forget to get rid of "package class_path_example.class_path;" from java file
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(PythagoreTheory.distance(4, 3, 6, 8));

        Greeting greeting = new Greeting("Java Class Path");
        greeting.greet("Hi, good learning!");
    }
}
