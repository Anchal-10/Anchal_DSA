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

        ListNode m=middle(head);
        ListNode curr=reverse(m);
        ListNode x=head;
        ListNode y=curr;
    int sum=0;
    int max=0;
        while(y!=null){
sum=x.val+y.val;
max=Math.max(sum,max);
            x=x.next;
            y=y.next;
        }
        return max;
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
