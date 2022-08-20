/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode mid=getMiddle(head);
        ListNode rev=getReverse(mid);
    ListNode m=head;
           ListNode n=rev;
        int sum=0;
        int max=0;
        while(m!=mid){
            sum=m.val+n.val;
            max=Math.max(max,sum);
            
            m=m.next;
            n=n.next;
        }
        return max;
        
 

    }
    public ListNode getMiddle(ListNode head){
        ListNode slow=head;
                ListNode fast=head;
        while(fast!=null&&fast.next!=null){
fast=fast.next.next;
        slow=slow.next;
        }
        System.out.print(slow.val+ " ");
    return slow;

        
    }
    public ListNode getReverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
                ListNode next=null;
while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}
        return prev;
    }
    
}