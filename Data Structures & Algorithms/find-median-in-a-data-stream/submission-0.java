class MedianFinder {

    PriorityQueue<Integer> secondHeap = new PriorityQueue<>();
    PriorityQueue<Integer> firstHeap = new PriorityQueue<Integer>((i, j)->j-i);

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(!secondHeap.isEmpty() && num >= secondHeap.peek()){
            secondHeap.offer(num);
        }else if(!firstHeap.isEmpty() && num <= firstHeap.peek()){
            firstHeap.offer(num);
        }else{
            firstHeap.offer(num);
        }
        if(secondHeap.size() - firstHeap.size() >=2){
            firstHeap.offer(secondHeap.poll());
        }else if(firstHeap.size() - secondHeap.size()>=2){
            secondHeap.offer(firstHeap.poll());
        }        
    }
    
    public double findMedian() {
        if((secondHeap.size() + firstHeap.size())%2==0){
            return (secondHeap.peek() + firstHeap.peek())/2.0;
            //even
        }else{
            if(secondHeap.size()>firstHeap.size()){
                return secondHeap.peek();
            }else{
                return firstHeap.peek();
            }
        }
    }
}
