package generic_programming;

public class CustomArray<T> {
    private final T[] items;

    public CustomArray(T[] items) {
        this.items = items.clone();
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}
