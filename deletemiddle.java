/* delete middle element in linkedlist leetcode
Definition for singly-linked list.*/


 public class ListNode 
 {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; 
  }
  }

class Solution
 {
    public ListNode deleteMiddle(ListNode head)
	{
        if(head==null || head.next==null) return null;
        ListNode c1=head,c2=head;
        boolean k=false;
        while(c2!=null && c2.next!=null){
            if(k)
            c1=c1.next;
            c2=c2.next.next;
            k=true;
        }
        c1.next=c1.next.next;
        return head;
    }
}