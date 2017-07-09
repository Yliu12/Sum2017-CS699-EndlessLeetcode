package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/#/description
 * Created by yliu12 on 2017/7/8.
 * 83 / 83 test cases passed.
 * Status: Accepted
 * Runtime: 1 ms
 */
public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
