/**
 * Add Two Numbers
 * Created by jchen on 2/26/15.
 */

import java.util.*;

public class LeetCodeOJ2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        ListNode pre = new ListNode(-1);
        ListNode helper = pre;
        while (l1 != null || l2 != null) {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;

            int num = a + b + add;
            int c = num % 10;
            add = num /10;

            ListNode temp = new ListNode(c);
            helper.next = temp;
            helper = helper.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if (add != 0) {
            ListNode temp = new ListNode(add);
            helper.next = temp;
        }
        return pre.next;
    }
}
