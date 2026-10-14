class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (i,j)->mp.get(i)-mp.get(j));
        for(Integer key:mp.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int []res = new int[k];
        int cnt = 0;
        while(!pq.isEmpty()){
            res[cnt++] = pq.poll();
        }
        return res;
    }
}
