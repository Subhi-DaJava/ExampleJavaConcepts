package Interface_inheritence.default_method_ex.eg_one;

public class Main implements TestB {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.show(); // Default method in TestB
        obj.display();
    }

    @Override
    public void display() {
        System.out.println("Display method in Main class");
    }
}
