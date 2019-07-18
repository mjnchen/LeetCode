package com.mjnchen.leetcode.algorithms;

/**
 * Created by jchen on 12/29/15.
 * Min Stack
 */

public class LeetCodeOJ155 {
    class MinStack {
        public class StackNode {
            int value;
            int min;
            StackNode next;
            public StackNode(int x) {
                value = x;
                min = x;
                next = null;
            }
        }

        StackNode head;
        public void push(int x) {
            if (head == null) {
                head = new StackNode(x);
            } else {
                StackNode temp = new StackNode(x);
                temp.min = Math.min(head.min, x);
                temp.next = head;
                head = temp;
            }
        }

        public void pop() {
            if (head == null) {
                return;
            } else {
                head = head.next;
            }
        }

        public int top() {
            if (head == null) {
                return Integer.MAX_VALUE;
            } else {
                return head.value;
            }
        }

        public int getMin() {
            if (head == null) {
                return Integer.MAX_VALUE;
            } else {
                return head.min;
            }
        }
    }
}

