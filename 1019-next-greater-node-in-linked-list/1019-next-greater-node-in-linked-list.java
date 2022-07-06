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
    public int[] nextLargerNodes(ListNode head) {
       Stack<Integer> stack=new Stack<>();
        ListNode m=head;
        int c=0;
        while(m!=null){

            m=m.next;
            c++;
        }
      int[]arr=new int[c];
        int i=0;
        ListNode temp=reverse(head);
        while(temp!=null){
            while(!stack.isEmpty() && stack.peek()<=temp.val){
                stack.pop();
            }
            if(!stack.isEmpty()){
                arr[i++]=stack.peek();
            }
            else{
                arr[i++]=0;
            }
            System.out.print(temp.val + " ");
            stack.push(temp.val);
                        temp=temp.next;

        }
        int a[]=new int[arr.length];
        int v=0;
        for(int j=arr.length-1;j>=0;j--){
            a[v++]=arr[j];
        }
        return a;
    
        
    }
    public ListNode reverse(ListNode head){
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