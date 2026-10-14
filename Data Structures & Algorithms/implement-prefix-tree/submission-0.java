class PrefixTree {

    Node root = null;

    public PrefixTree() {
        root = new Node();     
    }

    public void insert(String word) {
        Node crawl = root;
        for(char c:word.toCharArray()){
            Node n = crawl.mp.get(c);
            if(n == null){
                n = new Node();
                n.ch = c;
                crawl.mp.put(c, n);
            }
            crawl = n;
        }
        crawl.isEnd = true;
    }

    public boolean search(String word) {
        Node crawl = root;
        for(char c:word.toCharArray()){
            Node n = crawl.mp.get(c);
            if(n == null){
                return false;
            }
            crawl = n;
        }
        if(crawl.isEnd) return true;
        return false;
    }

    public boolean startsWith(String prefix) {
        Node crawl = root;
        for(char c:prefix.toCharArray()){
            Node n = crawl.mp.get(c);
            if(n == null){
                return false;
            }
            crawl = n;
        }
        return true;
    }

    static class Node{
        Map<Character, Node> mp = new HashMap<>();
        boolean isEnd = false;
        char ch;

        public Node(){
            
        }
    }
}
