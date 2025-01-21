package Interface_inheritence.default_method_ex.eg_one;

public interface TestA {

    default void show() {
        System.out.println("Default method in TestA");
    }

    void display();
}
