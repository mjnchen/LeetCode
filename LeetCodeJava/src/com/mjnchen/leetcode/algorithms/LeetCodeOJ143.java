/**
 * Created by jchen on 12/27/15.
 * Reorder List
 */

import java.util.*;

public class LeetCodeOJ143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            if (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }

        ListNode head2 = slow.next;
        slow.next = null;
        ListNode newHead2 = reverseList(head2);

        head = mergeTwoLists(head, newHead2);
        return;

    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode p1 = head;
        ListNode p2 = head.next;

        head.next = null;
        while (p1 != null && p2 != null) {
            ListNode t = p2.next;
            p2.next = p1;
            p1 = p2;
            if (t != null) {
                p2 = t;
            } else {
                break;
            }
        }
        return p2;
    }

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        while (head1!=null && head2!=null)
        {
            current.next = head1;
            current = current.next;
            head1 = head1.next;

            current.next = head2;
            current = current.next;
            head2 = head2.next;
        }

        if (head1 != null)
            current.next = head1;
        else
            current.next = head2;

        return head.next;
    }
}
