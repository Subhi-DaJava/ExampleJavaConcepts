package Collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Java Puzzle! What is the output of this program? Assume you have all the imports you need.
 */
public class ListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4));
        for(int i = 0; i < a.size(); i++) a.remove(i);
        System.out.println(a);

        ArrayList<Integer> b = new ArrayList<>();
        System.out.println(b);
    }
}
