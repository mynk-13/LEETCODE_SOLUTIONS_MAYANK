/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null ) return false;
        

        
        ListNode a=head;
        ListNode b=head.next;
        
       
        
        while(b!=null && b.next!=null){
            a=a.next;
            b=b.next.next;
            
            if(a==b){
                return true;
            }
        }
      return false;
    }
}