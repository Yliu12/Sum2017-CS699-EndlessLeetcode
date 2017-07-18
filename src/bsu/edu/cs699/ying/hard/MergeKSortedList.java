package bsu.edu.cs699.ying.hard;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/#/discuss
 * Created by yliu12 on 7/18/2017.
 */
public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {


    }

    ;

    public ListNode mergeKLists(ListNode[] lists) {
        Map<Integer, Integer> tm = new TreeMap<>();

        for (ListNode curNode : lists) {


            while (curNode != null) {
                if (tm.containsKey(curNode.val)) {
                    tm.put(curNode.val, tm.get(curNode.val) + 1);

                } else {
                    tm.put(curNode.val, 1);
                }
                curNode = curNode.next;
            }
        }
        ListNode tmp =  new ListNode(0);

        for (Map.Entry<Integer, Integer> st : tm.entrySet()) {
            int i = st.getValue();


            while (i > 0) {
                if(tmp == null){
                    tmp = new ListNode(0);
                }
                    tmp.val = st.getKey();
                tmp = tmp.next;
                i--;
            }

        }
        return tmp;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
}
