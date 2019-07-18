package com.mjnchen.leetcode.algorithms;

import com.mjnchen.leetcode.utils.ListNode;
import java.util.Stack;

/**
 * Reverse Linked List II
 * Created by jchen on 2/26/15.
 */

public class LeetCodeOJ92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null){
            return null;
        }
        if(m >= n){
            return head;
        }

        ListNode helper = new ListNode(-1);
        helper.next = head;

        ListNode pre = helper;
        int count1 = m;
        while(count1 > 1 && pre.next.next != null){
            count1--;
            pre = pre.next;
        }

        ListNode current = pre.next;
        int count2 = n - m;
        Stack<ListNode> s = new Stack<ListNode>();
        while(count2 >= 0 && current != null){
            count2--;
            ListNode temp = current;
            s.push(temp);
            current = current.next;
        }

        ListNode after = current;
        while(!s.empty()){
            ListNode temp = s.pop();
            pre.next = temp;
            pre = pre.next;
        }
        pre.next = after;

        return helper.next;
    }
}
