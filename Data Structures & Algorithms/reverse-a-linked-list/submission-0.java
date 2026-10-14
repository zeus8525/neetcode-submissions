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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode first = head;
        ListNode next = head.next;
        ListNode res = null;
        ListNode temp = null;
        while(first!=null){
            temp = res;
            res = first;
            res.next = temp;
            first = next;
            if(next!=null)
                next = next.next;
        }
        return res; 
    }
}
