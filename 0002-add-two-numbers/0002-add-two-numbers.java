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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode curr=l1;
        ListNode curr1=l2;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(curr!=null || curr1!=null|| carry!=0){
            int sum=0;
            if(curr!=null){
             sum=curr.val;
            }
            if(curr1!=null){
                sum+=curr1.val;
            }
            sum=sum+carry;
            ListNode ans=new ListNode(sum%10);
            temp.next=ans;
            temp=temp.next;
            carry=sum/10;
            if(curr!=null){
            curr=curr.next;
            }
            if(curr1!=null){
            curr1=curr1.next;
            
        }
        }
    return dummy.next;
    }
}