package com.uyghur.java.algo.impl_queue_using_stacks_010923;

import com.uyghur.java.algo.stack_210823.stack_array_list_210823.ArrayStack;

/**
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 * Implement the MyQueue class:
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * Notes:
 * Only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
 *
 * Queue start                         Queue end
 * Stack1 start                        Stack2 start
 *                                  stack2.push(elt1), stack2.push(elt2)  elt1, elt2
 * stack1.pop()
 * steps: 1.add all elements of stack2, if stack1 is empty, to stack1 -> now, elt2, elt1(last one of stack) -> 2. take off elt1 from stack1
 */
public class ImplQueueUsingStacks {
    // Stack<Integer> stack = new Stack<>();
    ArrayStack<Integer> stack1 = new ArrayStack<>(10);
    ArrayStack<Integer> stack2 = new ArrayStack<>(10);

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void push(int elt) {
        stack2.push(elt);
    }

    public int pop() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        return stack1.pop();
    }

    public int peek() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        return stack1.peek();
    }
}
