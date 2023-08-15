package com.uyghur.java.algo.queue_310723;
/**
 * A collection designed for holding elements prior to processing.
 * Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations.
 * Each of these methods exists in two forms: one throws an exception if the operation fails,
 * the other returns a special value (either null or false, depending on the operation).
 * The latter form of the insert operation is designed specifically for use with capacity-restricted Queue implementations;
 * in most implementations, insert operations cannot fail.
 *
 * offer(T t)
 * Inserts the specified element into this queue.
 *
 * peek()
 * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
 *
 * poll()
 * Retrieves and removes the head of this queue, or returns null if this queue is empty.
 *
 * isEmpty()
 * Check if the queue is empty or not, return true or false
 *
 */
public interface Queue<T> {
    /**
     * Inserts the specified element into this queue.
     * @param value T
     * @return boolean
     */
    boolean offer(T value);

    T poll();

    T peek();

    boolean isFull();
    boolean isEmpty();

}
