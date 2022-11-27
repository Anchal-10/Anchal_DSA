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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            stack.push(curr);
            curr=curr.next;
        }
        while(!stack.isEmpty()){
            if(curr==null||stack.peek().val>= curr.val){
                stack.peek().next=curr;
                curr=stack.peek();
            }
            stack.pop();
        }
    return curr;
    }
}
    



                                                                                                                                                                                                                         
  /*      ListNode curr = head;
        Stack<ListNode> stack = new Stack();
		
		//\U0001d468\U0001d485\U0001d485\U0001d48a\U0001d48f\U0001d488 \U0001d482\U0001d48d\U0001d48d \U0001d495\U0001d489\U0001d486 \U0001d486\U0001d48d\U0001d486\U0001d48e\U0001d486\U0001d48f\U0001d495\U0001d494 \U0001d490\U0001d487 \U0001d48d\U0001d48a\U0001d48f\U0001d48c\U0001d486\U0001d485\U0001d48d\U0001d48a\U0001d494\U0001d495 \U0001d495\U0001d490 \U0001d494\U0001d495\U0001d482\U0001d484\U0001d48c
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }
        
		//\U0001d484\U0001d490\U0001d48e\U0001d491\U0001d482\U0001d493\U0001d48a\U0001d48f\U0001d488 \U0001d495\U0001d489\U0001d486 \U0001d497\U0001d482\U0001d48d\U0001d496\U0001d486 \U0001d490\U0001d487 \U0001d491\U0001d486\U0001d486\U0001d48c \U0001d490\U0001d487 \U0001d494\U0001d495\U0001d482\U0001d484\U0001d48c \U0001d498\U0001d48a\U0001d495\U0001d489 \U0001d484\U0001d496\U0001d493\U0001d493\U0001d486\U0001d48f\U0001d495 \U0001d48f\U0001d490\U0001d485\U0001d486 \U0001d497\U0001d482\U0001d48d\U0001d496\U0001d486
        while(!stack.isEmpty()){
            if(curr == null || stack.peek().val >= curr.val){
                stack.peek().next = curr;
                curr = stack.peek();
            }
            stack.pop();
        }
        return curr;
    }
}*/
