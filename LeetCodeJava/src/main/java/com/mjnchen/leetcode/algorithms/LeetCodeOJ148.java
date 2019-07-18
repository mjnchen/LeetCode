package com.mjnchen.leetcode.algorithms;

import com.mjnchen.leetcode.utils.ListNode;

/**
 * Created by jchen on 12/29/15.
 * Sort List
 */

public class LeetCodeOJ148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Count number of elements
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

        ListNode h1 = sortList(head);
        ListNode h2 = sortList(head2);

        return mergeList(h1, h2);
    }

    public ListNode mergeList(ListNode h1, ListNode h2) {
        if (h1 == null) {
            return h2;
        } else if (h2 == null) {
            return h1;
        } else if (h1 == null && h2 == null){
            return null;
        }

        ListNode fakeHead = new ListNode(-1);
        ListNode p = fakeHead;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                p.next = h1;
                h1 = h1.next;
                p = p.next;
            } else {
                p.next = h2;
                h2 = h2.next;
                p = p.next;
            }
        }

        if (h1 != null) {
            p.next = h1;
        } else if (h2 != null){
            p.next = h2;
        }

        return fakeHead.next;
    }
}

