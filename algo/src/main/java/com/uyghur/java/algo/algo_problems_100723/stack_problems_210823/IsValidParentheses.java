package com.uyghur.java.algo.algo_problems_100723.stack_problems_210823;

import com.uyghur.java.algo.stack_210823.stack_array_list_210823.ArrayStack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * Example 1:
 * Input: s = "()"
 * Output: true
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * Input: s = "([{}])"
 * Output: true
 * Example 4:
 * Input: s = "({[})]"
 * Output: false
 * Example 5:
 * Input: s = "[({[{{()}}]})]"
 * Output: true
 * Example 6:
 * Input: s = "(]"
 * Output: false
 * Example 7:
 * Input: s = "(("
 * Output: false
 * Example 8:
 * Input: s = ")("
 * Output: false
 * Example 9:
 * Input: s = ")"
 * Output: false
 *
 * Solution :
 * 1  meet left part ( or ] add right part ) or ] to a stack
 * 2  meet right part comparer to the peek elt of the stack and delete the elt
 * if the right part is not equal to the peek return false
 */
public class IsValidParentheses {

    public boolean isValid(String str) {

        ArrayStack<Character> chars = new ArrayStack<>(str.length());

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                chars.push(')');
            } else if (c == '[') {
                chars.push(']');
            } else if (c == '{') {
                chars.push('}');
            } else {
                if (!chars.isEmpty() && chars.peek() == c) {
                    chars.pop();
                } else {
                    return false;
                }
            }
        }
        return chars.isEmpty();
    }

}
