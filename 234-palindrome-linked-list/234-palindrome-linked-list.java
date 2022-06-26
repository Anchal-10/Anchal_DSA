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
        ListNode m=middle(head);
        ListNode curr=reverse(m);
        ListNode x=head;
        ListNode y=curr;
        while(y!=null){
if(x.val!=y.val){
return false;
}
            x=x.next;
            y=y.next;
        }
        return true;
    }
    
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&& fast.next!=null){
slow=slow.next;
        fast=fast.next.next;
        }
        return slow;
        
}
        public ListNode reverse(ListNode head){
            ListNode prev=null;
            ListNode next=null;
            ListNode curr=head;
        while(curr!=null){
next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
            return prev;

}
}
