package Interface_inheritence.default_method_ex.eg_one;

public interface TestB extends TestA {

    default void show() {
        System.out.println("Default method in TestB");
    }

    void display();
}
