package array_notion.arrays_aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        String[] stringArray = new String[] { "A", "B", "C", "D" };
        //ArrayList<String> list = Arrays.asList("a", "b", "c"); //no instance(s) of type variable(s) T exist so that List<T> conforms to ArrayList<String>
        List stringList = Arrays.asList(stringArray);
       // stringList.add("d"); // Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println(stringList);

        String[] stringArray2 = new String[] { "A", "B", "C", "D" };
        List stringList2 = new ArrayList<>(Arrays.asList(stringArray));

        stringList2.set(0, "E");

        System.out.println("StringList2: " + stringList2);
        System.out.println("StringArray2:" + stringArray2);
    }
}
