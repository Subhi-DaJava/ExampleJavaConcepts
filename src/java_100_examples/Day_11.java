package java_100_examples;

/**
 * Problem : All letters in the Alphabets
 * Output : a to z  & A to Z
 */
public class Day_11 {
    public static void main(String[] args) {
        System.out.println("All lowercase letters : ");
        for (char i ='a' ; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("All uppercase letters : ");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
}
