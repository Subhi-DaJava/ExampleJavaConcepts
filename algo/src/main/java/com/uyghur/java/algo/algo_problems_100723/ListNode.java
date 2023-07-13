package com.uyghur.java.algo.algo_problems_100723;

import java.util.Objects;

public class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);

        stringBuilder.append("[");

        ListNode pointer = this;

        while (pointer != null) {
            stringBuilder.append(pointer.value);

            if (pointer.next != null) {
                stringBuilder.append(", ");
            }

            pointer = pointer.next;
        }

        stringBuilder.append("]");

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return value == listNode.value && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
