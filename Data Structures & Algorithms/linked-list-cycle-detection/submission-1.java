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
        if(head==null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        boolean first = true;
        while(fast.next !=null && fast.next.next!=null){
            if(!first && slow.val == fast.val) return true;
            first = false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
