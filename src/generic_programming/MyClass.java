package generic_programming;

/**
 * What will the get method return if you create an instance but don't specify the type argument?
 *
 * In this case, the field of the class is Object, and the get method returns an Object as well.
 * GenericType<Object> instance5 = new GenericType<>("abc"); // it is parameterized with Object
 */
public class MyClass<T> {
    public static void main(String[] args) {
        MyClass instance = new MyClass("Hello!");
        // It will return a reference of Object type
        System.out.println(instance.get());

        System.out.println(instance.getClass().getName());
        System.out.println(instance.getClass());
    }
    private T t;

    public MyClass(T t) {
        this.t = t;
    }
  // What will the get method return if you create an instance but don't specify the type argument?
    public T get() {
        return t;
    }
}
