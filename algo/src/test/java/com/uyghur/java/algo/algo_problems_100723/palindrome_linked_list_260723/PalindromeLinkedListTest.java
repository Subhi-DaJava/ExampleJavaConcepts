package com.uyghur.java.algo.algo_problems_100723.palindrome_linked_list_260723;

import com.uyghur.java.algo.algo_problems_100723.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PalindromeLinkedListTest {

    @InjectMocks
    private PalindromeLinkedList palindromeLinkedList;

    @Test
    void checkPalindromeWithOddNodeNumber() {
        ListNode listNode = ListNode.of(1,2,2,2,1);
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isTrue();
    }

    @Test
    void checkPalindromeWithEvenNodeNumber() {
        ListNode listNode = ListNode.of(1,2,2,2,2,1);
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isTrue();
    }

    @Test
    void checkPalindromeWithNull() {
        ListNode listNode = ListNode.of();
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isTrue();
    }

    @Test
    void checkPalindromeWithEvenNodeNumberShouldReturnFalse() {
        ListNode listNode = ListNode.of(1,2,2,5,2,3,1);
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isFalse();
    }
    @Test
    void checkPalindromeWithOddNodeNumberShouldReturnFalse() {
        ListNode listNode = ListNode.of(1,2,2,2,1,4,5,8);
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isFalse();
    }
    @Test
    void checkPalindromeWithTwoNodesShouldReturnFalse() {
        ListNode listNode = ListNode.of(1,2);
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isFalse();
    }
    @Test
    void checkPalindromeWithTwoNodesShouldReturnTrue() {
        ListNode listNode = ListNode.of(2,2);
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isTrue();
    }
    @Test
    void checkPalindromeWithOneNodeShouldReturnTrue() {
        ListNode listNode = ListNode.of(2);
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isTrue();
    }
    @Test
    void checkPalindromeWithMultiNodesShouldReturnTrue() {
        ListNode listNode = ListNode.of(1,2,3,4,5,6,7,8,9,5,5,5,9,8,7,6,5,4,3,2,1);
        assertThat(palindromeLinkedList.isPalindrome(listNode)).isTrue();
    }
}