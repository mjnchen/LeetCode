/**
 * Permutation Sequence
 * Created by jchen on 2/26/15.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LeetCodeOJ61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(k == 0){
            return head;
        }

        ListNode start = head;
        int length = 1;
        while(start.next != null){
            start = start.next;
            length++;
        }
        // Loop the list
        start.next = head;

        k = length - k % length;
        while(k > 0){
            start = start.next;
            k--;
        }

        head = start.next;
        start.next = null;
        return head;
    }
}
