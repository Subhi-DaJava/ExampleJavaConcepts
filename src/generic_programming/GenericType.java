package generic_programming;

/**
 * Generic programming
 * There are situations when methods and classes do not depend on the data types on which they operate.
 * For example, the algorithm to find an element in an array can process arrays of strings, integers or custom classes.
 * It does not matter what the array stores: the algorithm is always the same.
 * Yet we cannot write this algorithm as a single method, because it requires different arguments (int[], String[], etc).
 *
 */
public class GenericType<T> {
    private T t;

    public GenericType(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public T set(T t) {
        this.t = t;
        return this.t;
    }
}
