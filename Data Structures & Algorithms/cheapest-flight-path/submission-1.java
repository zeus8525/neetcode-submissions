class Solution {
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            PriorityQueue<Node> pq = new PriorityQueue<>((i,j)->i.cost-j.cost);

            Map<Integer,List<Node>> mp = new HashMap<>();
            for(int []flight:flights){
                mp.putIfAbsent(flight[0],new ArrayList<Node>());
                mp.putIfAbsent(flight[1],new ArrayList<Node>());
                mp.get(flight[0]).add(new Node(flight[1],flight[2]));
            }
            for(Node node:mp.getOrDefault(src,null)){
                pq.offer(new Node(node.src, node.cost, 1));
            }
            while(!pq.isEmpty()){
                Node poll = pq.poll();
                if(poll.stops-1>k){
                    continue;
                }
                if(poll.src==dst){
                    return poll.cost;
                }
                for(Node node:mp.getOrDefault(poll.src,null)){
                    pq.offer(new Node(node.src,node.cost+poll.cost,poll.stops+1));
                }
            }
            return -1;
        }

        class Node{
            int src;
            int cost;
            int stops;
            public Node(int src, int cost){
                this.src = src;
                this.cost = cost;
            }
            public Node(int src, int cost,int stops){
                this.src = src;
                this.cost = cost;
                this.stops = stops;
            }

            @Override
            public String toString() {
                return this.src+","+this.cost+","+this.stops;
            }
        }
    }