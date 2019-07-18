package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 2/26/15.
 */

import com.mjnchen.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeOJ147 {
    public ListNode insertionSortList(ListNode head) {
        // zero or one element in list
        if(head == null || head.next == null){
            return head;
        }
        // resHead is the first element of resulting sorted list
        ListNode resHead = null;
        ListNode nextNode = head;
        while(nextNode != null){
            ListNode current = nextNode;
            nextNode = nextNode.next;
            if(resHead == null || current.val < resHead.val ){
                // insert into the head of the sorted list
                // or as the first element into an empty sorted list
                current.next = resHead;
                resHead = current;
            }else{
                // insert current element into proper position in non-empty sorted list
                ListNode p = resHead;
                while(p != null){
                    if(p.next == null || // last element of the sorted list
                        current.val < p.next.val ) // middle of the list
                    {
                        // insert into middle of the sorted list or as the last element
                        current.next = p.next;
                        p.next = current;
                        break; // done
                    }
                    p = p.next;
                }
            }
        }

        return resHead;
    }
}

