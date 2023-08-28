package com.uyghur.java.algo.stack_210823.stack_interface_210823;
/*
  top---------------------------------------------button
 */
public interface Stack<T> {
    /**
     * Add T to top
     * @param value T
     * @return True or false
     */
    boolean push(T value);

    /**
     * Retrieve T from top
     * @return T if isEmpty return null
     */
    T pop();
    /**
     * Retrieve T from top
     * @return T if isEmpty return null
     */
    T peek();

    /**
     * null is empty
     * @return true or false
     */
    boolean isEmpty();

    /**
     * size == capacity
     * @return true or false
     */
    boolean isFull();
}
