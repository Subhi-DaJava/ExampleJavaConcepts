package out_example.string_list;

import java.util.ArrayList;
import java.util.List;

public class StringListReplace {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String one = "One";
        String newOne = one.replace('O', 'B');
        System.out.println(newOne);
        String two = new String("Two");
        list.add(one);
        list.add(two);
        List<String> list1 = list;
        String newOne2 = one.replace("O", "B");
        System.out.println(newOne2);
        String newTwo = two.replace('w', 'o');
        System.out.println(newTwo);
        for (String val : list)
            System.out.print(val + ":");
        for (String val : list1)
            System.out.print(val + ":");

        System.out.println("************************************************");
        String s1="my name is Java, my name is java";
        String replaceString = s1.replace("is","was"); // replaces all occurrences of "is" to "was"
        System.out.println(replaceString);

        System.out.println("*****************************************************************");
        String str = "oooooo-hhhh-oooooo";
        String rs = str.replace("h","s"); // Replace 'h' with 's'
        System.out.println(rs);
        rs = rs.replace("s","h"); // Replace 's' with 'h'
        System.out.println(rs);
    }
}
