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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode merged = null;
            ListNode crawl = null;
            while(list1!=null && list2!=null){
                if(crawl == null){
                    if(list1.val < list2.val){
                        crawl = list1;
                        merged = list1;
                        list1 = list1.next;
                    }else{
                        crawl = list2;
                        merged = list2;
                        list2 = list2.next;
                    }
                }else{
                    if(list1.val <= list2.val){
                        crawl.next = list1;
                        list1 = list1.next;
                    }else{
                        crawl.next = list2;
                        list2 = list2.next;
                    }
                    crawl = crawl.next;
                }
            }
            while(list1!=null){
                if(crawl == null){
                    crawl = list1;
                    merged = list1;
                    list1 = list1.next;
                }else{
                    crawl.next = list1;
                    list1=list1.next;
                    crawl = crawl.next;
                }                
            }
            while(list2!=null){
                if(crawl == null){
                    crawl = list2;
                    merged = list2;
                    list2 = list2.next;
                }else{
                    crawl.next = list2;
                    list2=list2.next;
                    crawl = crawl.next;
                }                
            }
            return merged;
        }
    }
