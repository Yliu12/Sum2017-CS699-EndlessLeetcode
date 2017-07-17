package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/reverse-linked-list/#/description
 * Created by yliu12 on 2017/7/16.
 * 27 / 27 test cases passed.
 * Status: Accepted
 * Runtime: 1 ms
 */
public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    public ListNode reverseList(ListNode head) {
        if (head == null || null == head.next) {
            return head;
        }
        ListNode nextNode = head.next;
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newHead;

    }

}
