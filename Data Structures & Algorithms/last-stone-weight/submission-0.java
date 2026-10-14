class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i,j) -> j-i);

        for(int i:stones){
            pq.offer(i);
        }
        while(pq.size()>1){
            int one = pq.poll();
            int two = pq.poll();
            pq.offer(Math.abs(one-two));
        }
        return pq.poll();
    }
}
