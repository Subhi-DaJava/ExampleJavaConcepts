package com.uyghur.java.algo.impl_stack_using_queue_010923;

import com.uyghur.java.algo.queue_310723.arrayQueue_headtail_030823.ArrayQueueHeadTail;

/**
 * Implement a last-in-first-out (LIFO) stack using only one queue. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 *
 * Queue Start                    Queue End
 * Stack LIFO
 *
 * queue.offer(elt1) -> add to end of queue
 * queue.offer(elt2) -> add to end fo queue
 * queue.offer(elt3) -> add to end fo queue
 *
 * elt3  should be the top of stack -> queue.offer(poll()) -> queue.offer(poll()) -> now elt3 is the top of stack, after 2 times
 */
public class ImplStackUsingQueue {
    // Queue<Integer> linkedListQueue = new LinkedList<>();
    ArrayQueueHeadTail<Integer> queue = new ArrayQueueHeadTail<>(10);
    private int size = 0;

    public void push(int elt) {
        queue.offer(elt);

        for (int i = 0; i < size; i++) {
            queue.offer(queue.poll());
        }
        size++;
    }

    public boolean empty() {
        return queue.isEmpty() || size == 0;
    }

    public int pop() {
        size--;
        return queue.poll();
    }

    public int peek() {
        return queue.peek();
    }

}
