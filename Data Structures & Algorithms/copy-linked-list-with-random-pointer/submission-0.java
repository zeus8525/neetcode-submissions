/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node crawl = head;
        Node res = null;
        Node retVal = null;
        while (crawl != null) {
            Node next = null;
            Node random = null;
            if (res == null) {
                res = new Node(crawl.val);
                retVal = res;
                map.put(crawl, res);
            }
            if (crawl.next != null){
                if (map.get(crawl.next) != null) {
                    next = map.get(crawl.next);
                } else {
                    next = new Node(crawl.next.val);
                }
                res.next = next;
                map.putIfAbsent(crawl.next, res.next);
            }
            if (crawl.random != null) {
                if (map.get(crawl.random) != null) {
                    random = map.get(crawl.random);
                } else {
                    random = new Node(crawl.random.val);
                }
                res.random = random;
                map.putIfAbsent(crawl.random, res.random);
            }
            crawl = crawl.next;
            res = res.next;
        }
        return retVal;
    }        
}
