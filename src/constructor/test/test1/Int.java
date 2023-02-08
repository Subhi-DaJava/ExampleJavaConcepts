package constructor.test.test1;

/**
 * What is the value of the field val in the created object?
 *
 * Int myInt = new Int(3);
 */
public class Int {
    public static void main(String[] args) {
        Int i = new Int(3);
        System.out.println(i.val);
    }
    int val = 1;

    public Int() {
        val = 2;
    }

    public Int(int val) {
        this();
    }

    public Int(int val1, int val2) {
        this(val1 + val2);
    }
    // réponse : 2
}
