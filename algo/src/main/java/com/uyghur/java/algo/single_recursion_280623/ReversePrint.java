package com.uyghur.java.algo.single_recursion_280623;

/**
 * To print a given string in reverse using recursion
 * Input: string
 * Output: gnirts
 *
 * string.length()
 */
public class ReversePrint {

    public void reverseStringPrint(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        reverseStringPrint(str.substring(1));
        System.out.print(str.charAt(0));
    }

//        public static void main(String[] args) {
//            String input = "Hello World";
//            reversePrint(input);
//        }

    /**
     * This method stops when the condition if (n == str.length() - 1) is satisfied, i.e. when n reaches the last valid position of the string.
     *
     * On each recursive call, the value of n is incremented by 1 to advance to the end of the string. When n reaches the last position,
     * the method simply returns the last character of the string, and no new recursive calls are made.
     *
     * So the recursion unwinds until n reaches the last position of the string,
     * then it moves up the recursive call stack returning characters one by one until the stack is fully unwound and the string of reversed characters is formed.
     * @param n the start index
     * @param str input String
     * @return Reverse String
     */

    public String returnReverseString(int n, String str) {
        if (n == str.length() - 1) {
            return String.valueOf(str.charAt(n));
        }

        return returnReverseString(n + 1, str) + str.charAt(n);
    }

    public void reversePrintStr(int n, String str) {
        if (n == str.length()) {
            return;
        }
        reversePrintStr(n + 1, str);
        System.out.print(str.charAt(n));
    }

}
