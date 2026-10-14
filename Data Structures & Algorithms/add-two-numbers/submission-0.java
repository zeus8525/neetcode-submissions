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
        ListNode result = null;
        ListNode resCrawl = null;
        ListNode l1crawl = l1;
        ListNode l2crawl = l2;
        int carry = 0;
        while(l1crawl!=null && l2crawl!=null){
            int sum = l1crawl.val + l2crawl.val;

            sum += carry;
            
            if( sum /10>0){
                carry = sum / 10;
                sum = sum%10;
            }else{
                carry = 0;
            }
            if(result == null){
                result = new ListNode(sum);
                resCrawl = result;
            }else{
                resCrawl.next = new ListNode(sum);
                resCrawl = resCrawl.next;
            }
            l1crawl = l1crawl.next;
            l2crawl = l2crawl.next;
        }

        while(l2crawl!=null){
            int sum = carry + l2crawl.val;
            if( sum /10>0){
                carry = sum / 10;
                sum = sum%10;
            }else{
                carry = 0;
            }
            resCrawl.next = new ListNode(sum);
            resCrawl = resCrawl.next;
            l2crawl = l2crawl.next;
        }

        while(l1crawl!=null){
            int sum = carry + l1crawl.val;
            if( sum /10>0){
                carry = sum / 10;
                sum = sum%10;
            }else{
                carry = 0;
            }
            resCrawl.next = new ListNode(sum);
            resCrawl = resCrawl.next;
            l1crawl = l1crawl.next;
        }

        if(carry>0){
            resCrawl.next = new ListNode(carry);
        }

        return result;
    }
}
