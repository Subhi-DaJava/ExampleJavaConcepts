package Genericity;

public class Solo<T> {
    private T val;

    public Solo() {
        this.val = null;
    }

    public Solo(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
