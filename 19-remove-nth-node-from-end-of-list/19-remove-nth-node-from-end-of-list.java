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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode refptr=dummy;
        ListNode mainptr=dummy;
        int c=0;
        while(c<n){
refptr=refptr.next;
            c++;
        }
        while(refptr.next!=null){
            refptr=refptr.next;
            mainptr=mainptr.next;
        }
        mainptr.next=mainptr.next.next;
    
    return dummy.next;
}
}
