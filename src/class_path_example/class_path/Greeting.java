package class_path_example.class_path;

public class Greeting {
    private final String java;

    public Greeting(String java) {
        this.java = java;
    }

    public void greet(String greetings) {
        System.out.println(java + ": " + greetings);
    }
}
