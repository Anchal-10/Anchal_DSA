/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode m=headA;
        ListNode n=headB;
        while(m!=n){
            m=m==null?headB:m.next;
                        n=n==null?headA:n.next;

        }
        return m;
    }
}