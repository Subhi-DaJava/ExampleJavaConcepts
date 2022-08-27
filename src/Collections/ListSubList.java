package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListSubList {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("c");
        List<String> b = a.subList(0,1);
        a.add("c");
        System.out.println(b.size());
    }
}
