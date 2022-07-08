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
    public boolean isPalindrome(ListNode head) {
        if(head==null){
return false;
        }
        ListNode mid=middle(head);
        ListNode rev=reverse(mid);
        ListNode curr=head;
        ListNode curr1=rev;
        while(curr!=mid){
            if(curr.val!=curr1.val){
return false;
            }
            
            curr=curr.next;
            curr1=curr1.next;
        }
        return true;
    }
    public ListNode middle(ListNode m){
        ListNode slow=m;
                ListNode fast=m;
        while(fast!=null && fast.next!=null){
slow=slow.next;
        fast=fast.next.next;
        }
        return slow;
    }
    
        
    public ListNode reverse(ListNode m){
ListNode curr=m;
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