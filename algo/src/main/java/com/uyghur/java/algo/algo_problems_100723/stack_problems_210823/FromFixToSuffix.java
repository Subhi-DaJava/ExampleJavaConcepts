package com.uyghur.java.algo.algo_problems_100723.stack_problems_210823;

import java.util.LinkedList;

/**
 * Mathematical Expression to Reverse Polish Notation
 * x + y = z;
 * [ "x", "y", "+" ];
 * javap -c -v .\FromFixToSuffix execute the code in target directory
 * <p>
 * 1) x + y -> steps -> x, + (put in the stack), y -> x + y
 * 2) x + y - z -> steps -> x,+(put in the stack ), y, -(compare with +, then put into stack), -> x + y -> z -> x+y-z
 * 3) x * y +/- z -> steps -> x, *(put in the stack), y, +/-(compare with *, then put into stack), x*y ->, x*y +/- z
 * 4) x + y * z -> steps -> x, +(put + into stack), y, *(put into the stack), z, -> y * z -> x + y*z
 * 5) x + y * z +/- s -> steps -> x, +(put + into stack), y, *(put into the stack), z, -> y * z -> x + y*z -> x + y*z +/- s
 * 6) (x + y) * or/ z -> steps -> x, + y, -> x+y -> z -> (x + y) * z, add (, when ) take off signs till to (
 * sauf + - * / concatenate to a string
 * else put the signs to stack according to the priority of the sign
 */
public class FromFixToSuffix {
    public void add() {
        int x = 5;
        int y = 10;
        int m = 6;
        int total = 0;
        int z = x + y;

        total = (x + y) * m + z * (y - x);  // {[(x,y,+),m,*],[(y,x,-),z,*],+}

    }

    public int priority(char p) {
        return switch (p) {
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            case '(' -> 0;
            default -> throw new IllegalArgumentException("Illegal argument: " + p);
        };
    }

    String transferInfixToSuffix(String op) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder(op.length());

        for (int i = 0; i < op.length(); i++) {
            char c = op.charAt(i);
            switch (c) {
                case '+', '-', '*', '/' -> {
                    if (stack.isEmpty()) {
                        stack.push(c);
                    } else {
                        if (priority(stack.peek()) < priority(c)) {
                            stack.push(c);
                        } else {
                            while (!stack.isEmpty() && priority(stack.peek()) >= priority(c)) {
                                stringBuilder.append(stack.pop());
                            }
                            stack.push(c);
                        }
                    }
                }
                case '(' -> {
                    stack.push(c);
                }
                case ')' -> {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        stringBuilder.append(stack.pop());
                    }
                    stack.pop(); // take off '('
                }
                default -> stringBuilder.append(c);
            }
        }
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
