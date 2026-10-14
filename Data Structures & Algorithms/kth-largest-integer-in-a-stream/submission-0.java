class KthLargest {

    int k;
    PriorityQueue<Integer> pq;

   public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>((i,j)->i-j);
        this.k=k;
        for(int i:nums){
            pq.offer(i);            
        }   
        poll();     
    }

    private void poll(){
        while(pq.size()>k){
            pq.poll();        
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        poll();
        return pq.peek();
    }
}
