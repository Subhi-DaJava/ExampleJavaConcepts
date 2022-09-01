package CodinGame;

import java.util.Locale;
import java.util.Scanner;

/**
 * Your program must change the case of the given string into camelCase. Except for the first word that must be written in lowercase,
 * all the words in the string must start with an uppercase letter and the other letters must be written in lowercase. Also, all spaces must be removed.
 * a word can be one letter long.
 * Example: input => A string S -> output => A string containing a camel case version of S.
 * Constraints:
 * S contains at least 1 word.
 * S contains only alphabetical characters and spaces.
 * S contains less than 256 characters.
 * Example: input : Hello World => output : helloWorld
 *
 * */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        System.out.println("Enter a string : ");   // S.matches("^[a-zA-Z]*$"); check space and les letters
        while (S.contains(" ") || !S.matches("^[a-zA-Z]*$") || S.toCharArray().length > 256){
            System.out.println("Enter a word minimum and only with the alphabetic letters and less than 256 characters :");
            S = in.nextLine();
        }
        String temp = " ";
        if (S.toCharArray().length == 1){
            S.toUpperCase();
        }
        if (S.contains(" ")){
            String[] words = S.split(" ");
            for (int i = 0; i < words.length; i++) {
                if(!('A' < words[i].charAt(0)) || !(words[i].charAt(0) < 'Z')){
                   //words[i].charAt(0) = words[i].charAt(0) - '26'; replace the letter by lowercase
                }
            }
        }


        System.out.println("answer");
    }

}
