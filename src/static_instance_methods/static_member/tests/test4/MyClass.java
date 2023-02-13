package static_instance_methods.static_member.tests.test4;

/**
 * In the body of doSomething you can directly invoke the method doDo.
 * <p>
 * In the body of doDo you can access the field TEXT.
 * <p>
 * In the body of doDo you can directly invoke the method doSomething.
 * <p>
 * In the body of doSomething you can access the field magic using the keyword this.
 * <p>
 * In the body of doSomething you can access the field TEXT.
 */
public class MyClass {
    static final String TEXT = "Hello";

    int magic = 10;

    static void doSomething() {
    }

    void doDo() {
    }

}
