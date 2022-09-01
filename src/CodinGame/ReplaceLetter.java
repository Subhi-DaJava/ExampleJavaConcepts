package CodinGame;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * For a given text t replace all sequences of the given character n by the number of characters in that sequence.
 * The text contain only ASCII characters.
 */
public class ReplaceLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the character replace with the number :");
        String n = in.nextLine();
        if(n.toCharArray().length > 1){
            System.out.println("Please enter again, the letter should be only one character :");
            n = in.nextLine();
        }
        System.out.println("The entered letter : " + n);
        System.out.println("Please enter a text :");
        String t = in.nextLine();
        System.out.println("Your text :  " + t);
        System.out.println("Check your text, all characters should be in ASCII table :");
        String textReplaced ="";
        char[] chars = t.toCharArray();
        if(t.length() >= 1 || t.length() <= 150){
            for (char ch : chars){
                if(ch > 127){
                    System.out.println("Your text should contain only ASCII characters !!, please reenter a text :");
                    in.nextLine();
                }
            }
            System.out.println("Your text is good !");
        }
        for (int i=0; i < chars.length; i++){
            if(chars[i] == n.charAt(0)){
                chars[i] = '1';
            }

        }
        for (char ch : chars){
            textReplaced += ch;
        }
        System.out.println(textReplaced);


        /*
        Understanding the regex :
        li \\A : Beginning of input
        \\p{ASCII} : Any ASCII character
        * : all repetitions
        \\z : End of input
         */
       /* char nonAscii = 0x00FF;
        String asciiText = "Hello";
        String nonAsciiText = "Buy: " + nonAscii;
        System.out.println(asciiText.matches("\\A\\p{ASCII}*\\z"));
        System.out.println(nonAsciiText.matches("\\A\\p{ASCII}*\\z"));*/

    /*    String string = "Hello World °";
        for (char c : string.toCharArray()){
            if (c > 127){
                System.out.println(false);
            }
        }*/


    }
}
