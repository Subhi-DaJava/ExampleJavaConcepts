package generic_programming;

/**
 * var doubleArray = new CustomArray<>(new Double[] {1.03, 2.04});
 *
 * MyClass obj1 = ..., obj2 = ...; // custom class
 *
 * var array = new CustomArray<>(new MyClass[] {obj1, obj2});
 */
public class Main {
    public static void main(String[] args) {
        GenericType<Integer> integerGenericType = new GenericType<>(10);
        System.out.println(integerGenericType.get());

        var stringArray = new CustomArray<>(new String[] {"item1", "item2", "item3"});

        for (int i = 0; i < stringArray.length(); i++) {
            System.out.print(stringArray.get(i) + " ");
        }
    }
}
