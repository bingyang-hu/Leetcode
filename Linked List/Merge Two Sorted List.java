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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        // corner case check 
        if (l1 == null && l2 == null){
            return null;
        }
        
        ListNode dummy = new ListNode(-199);
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode curr = dummy;
        while (cur1 != null && cur2 != null){
            if (cur1.val< cur2.val){
                curr.next=cur1;
                cur1 = cur1.next;
                
            }else{
                curr.next = cur2;
                cur2 = cur2.next;
            }
            curr = curr.next;
        }
        if (cur1 == null){
            curr.next = cur2;
        }
        if (cur2 == null) {
            curr.next = cur1;
        }
        return dummy.next;
        
        
    }
}
