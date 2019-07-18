/**
 * Created by jchen on 12/29/15.
 * 160. Intersection of Two Linked Lists
 */

public class LeetCodeOJ160 {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if (headA == null || headB == null) {
             return null;
         }

         int lenA = 0, lenB = 0;
         ListNode p1 = headA;
         ListNode p2 = headB;
         while (p1 != null) {
             p1 = p1.next;
             lenA++;
         }
         while (p2 != null) {
             p2 = p2.next;
             lenB++;
         }

         int diff = Math.abs(lenA - lenB);
         p1 = headA;
         p2 = headB;
         for (int i =0 ; i < diff; i++) {
             if (lenA > lenB) {
                 p1 = p1.next;
             } else {
                 p2 = p2.next;
             }
         }

         while (p1 != null || p2 != null) {
             if (p1 == p2) {
                 return p1;
             }
             p1 = p1.next;
             p2 = p2.next;
         }

         return null;
    }
}

