package equales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArraysEqual {
    public static void main(String[] args) {
        String[] array=new String[]{"A","B","C","D"};
        List<String> list1= Arrays.asList(array);
        List<String> list2= new ArrayList<>(Arrays.asList(array));
        List<String> list3= new ArrayList<>(Arrays.asList("A",new String("B"),"C","D"));
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));
    }
}
