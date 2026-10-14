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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((i,j)->i.val-j.val);
        for(ListNode node: lists){
            pq.offer(node);
        }
        ListNode res = null;
        ListNode crawl = null;
        while(!pq.isEmpty()){
            ListNode next = pq.poll();
            if(res == null){
                res = next;
                crawl = res;
            }else{
                crawl.next = next;
                crawl = crawl.next;
            }
            if(next.next!=null)
                pq.offer(next.next);
        }
        return res;
    }
}
