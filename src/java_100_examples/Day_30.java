package java_100_examples;
/**
 * Problem : Counting the length of the last word in a String
 * input: "  Coucou a String "
 * output: 6
 */
public class Day_30 {
    public static void main(String[] args) {
        String str = "   Sherqiy Turkistan Sini Soyimen Sen Uchun Jinim Pida Bolsun Deymen!!   ";
        String strCopy = str;

        str = str.trim(); // This method may be used to strip white space from the beginning and end of a string.
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) { // Count form the last character and stop when get the first ' ' space
            if(str.charAt(i) != ' ') {
                count++;
            }
            else {
                break;
            }
        }
        System.out.println("Count : " + count);
        System.out.println(str.length());

        System.out.println("Second method: \n");
        String arr[] = strCopy.split(" ");
        int countIndexLength = 0;
        countIndexLength = arr[arr.length-1].length();
        System.out.println("The length of the last word : " + countIndexLength);
    }
}
