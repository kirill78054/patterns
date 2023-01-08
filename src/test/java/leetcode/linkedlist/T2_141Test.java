package leetcode.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/*
Given , the head of a linked list, determine if the linked list has a cycle in it.head

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

 */
public class T2_141Test {

    @Test
    public void runTest() {
        ListNode one = new ListNode(3);
        ListNode two = new ListNode(2);
        one.next = two;
        ListNode three = new ListNode(0);
        two.next = three;
        ListNode four = new ListNode(-4);
        three.next = four;
        four.next = two;
        assertTrue(hasCycle(one));
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode first = head;
        ListNode second = head.next;
        while (second != null && second.next != null) {
            if (first.equals(second)) {
                return true;
            }

            first = first.next;
            second = second.next.next;
        }
        return false;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}