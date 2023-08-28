package com.uyghur.java.algo.algo_problems_100723.stack_problems_210823;

import java.util.LinkedList;

/**
 * Reverse Polish ‘Notation is postfix notation which in terms of mathematical notion signifies operators following operands. Let’s take a problem statement to implement RPN
 * Problem Statement: The task is to find the value of the arithmetic expression present in the array using valid operators like +, -, *, /.
 * Each operand may be an integer or another expression.
 * Note:
 * The division between two integers should truncate toward zero.
 * The given RPN expression is always valid. That means the expression would always evaluate to a result and there won’t be any divide by zero operation.
 *
 * Input: ["2", "1", "+", "3", "*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 *
 * Input: ["4", "13", "5", "/", "+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 *
 * Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 * Output: 22
 * Explanation:
 *   ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 */
public class ReversePolishNotation {

    LinkedList<Integer> stack = new LinkedList<>();

    public int rpn(String[] tokens) {
        for (String token : tokens) {
            switch (token) {
                case ("+") -> {
                    final int b = stack.pop();
                    final int a = stack.pop();
                    stack.push(a + b);
                }
                case ("-") -> {
                    final int b = stack.pop();
                    final int a = stack.pop();
                    stack.push(a - b);
                }
                case ("*") -> {
                    final int b = stack.pop();
                    final int a = stack.pop();
                    stack.push(a * b);
                }
                case ("/") -> {
                    final int b = stack.pop();
                    final int a = stack.pop();
                    stack.push(a / b);
                }
                default -> {
                    stack.push(Integer.parseInt(token));
                }
            }
        }
        return stack.pop();
    }
}
