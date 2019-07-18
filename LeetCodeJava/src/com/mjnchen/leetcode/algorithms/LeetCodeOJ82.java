package com.mjnchen.leetcode.algorithms;

/**
 * Remove Duplicates from Sorted List II
 * Created by jchen on 2/26/15.
 */

import com.mjnchen.leetcode.utils.ListNode;

import java.util.List;
import java.util.Stack;

public class LeetCodeOJ82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode pre = new ListNode(0);
        pre.next = head;

        ListNode p = pre;
        while(p.next != null && p.next.next != null){
            if(p.next.val == p.next.next.val){
                int dup = p.next.val;
                while(p.next != null && p.next.val == dup){
                    p.next = p.next.next;
                }
            }else{
                p = p.next;
            }
        }

        return pre.next;
    }
}
