package modifiers.protected_modifier.org.subhi.test;

public class Tiger {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Rrrrrrr!");
    }

    protected void run() {
        System.out.println(this.name + " is running!");
    }
}
