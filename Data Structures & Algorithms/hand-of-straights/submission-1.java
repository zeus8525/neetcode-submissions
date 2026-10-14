class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> set = new TreeMap<>();
        for(int i:hand){
            set.put(i,set.getOrDefault(i,0)+1);
        }

        if(hand.length % groupSize != 0){
            return false;
        }

        
        while(!set.isEmpty()){
            int key = set.ceilingKey(0);
            int currGroup = groupSize;    
            try{
                while(currGroup>0){
                    int cnt = set.get(key);
                    if(cnt-1 == 0){
                        set.remove(key);
                    }else{
                        set.put(key,set.get(key)-1);
                    }
                    key++;                
                    currGroup--;
                }
            }catch(Exception e){
                return false;
            }       
        }
        return true;
    }
}
