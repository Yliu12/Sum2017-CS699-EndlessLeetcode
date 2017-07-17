package bsu.edu.cs699.ying.easy;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/#/description
 * Created by yliu12 on 2017/7/16.
 * 208 / 208 test cases passed.
 * Status: Accepted
 * Runtime: 15 ms
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode mergeHead;
        if (l1.val < l2.val) {
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        } else {
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
}
