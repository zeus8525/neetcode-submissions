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
    public boolean hasCycle(ListNode head) {
        if(head ==null) return false;
        ListNode slow = head.next;
        if(head.next == null) return false;
        ListNode fast = head.next.next;
        while(fast!=null){
            if(slow == fast || slow.val == fast.val){
                return true;
            }
            slow = slow.next;
            if(fast.next!=null)
                fast = fast.next.next;
            else
                fast = null;
        }
        return false;
    }
}
