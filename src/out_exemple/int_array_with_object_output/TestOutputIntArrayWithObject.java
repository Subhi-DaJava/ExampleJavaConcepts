package out_exemple.int_array_with_object_output;

public class TestOutputIntArrayWithObject {
    public static void main(String[] args) {
        Object obj = new int[] {1, 2, 3};
        if (obj instanceof int[]) {
            System.out.println("Array");
        } else {
            System.out.println("Not an array");
        }
    }
}


