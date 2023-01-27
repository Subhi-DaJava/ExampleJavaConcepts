package char_special_symbol;

public class Character {
    public static void main(String[] args) {
        char ch = 'b';
        ch += 'a';
        ch -= 'b';
        System.out.println(ch); // prints 'a' without quotes

        System.out.println("***********************");
        char c = 'A';
        c += 10;
        System.out.println(c);   // 'K'
        System.out.println(++c); // 'L'
        System.out.println(++c); // 'M'
        System.out.println(--c); // 'L'

        System.out.println("******************************* Escape sequences ******************************************");
        /**
         * There are some special characters starting with a backslash \ which are known as the escape or control sequences.
         * They do not have corresponding symbols and cannot be found on a keyboard. To represent such characters we use a pair of regular symbols.
         * In a program, this pair will be considered as exactly one character with the appropriate code.
         */
        // '\n' is the newline character;
        // '\t' is the tab character;
        // '\r' is the carriage return character;
        // '\\' is the backslash character itself;
        // '\'' is the single quote mark;
        // '\"' is the double quote mark.
        // There is also a character to represent a single space ' '. It is just a regular character, not an escape sequence.

        System.out.print('\t'); // makes a tab
        System.out.print('a');  // prints 'a'
        System.out.print('\n'); // goes to the new line
        System.out.print('c');  // prints 'c'
        System.out.println();
        System.out.println("\u003f");
        System.out.println("'\uffff'"); // The maximum value of the char type

        System.out.println("************** test yourself *************");
        char c1 = 'e';
        c1 -= 'a';
        c1++;
        c1 += 'b';
        System.out.println(c1); // g or f

        char c2 = '1' + '3';
        System.out.println(c2); // 49 + 51 = 100 d Table ASCII
    }
}
