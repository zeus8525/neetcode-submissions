class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:bills){
            int rem = i-5;
            while(rem>0){
                if(rem>=10){
                    if(mp.getOrDefault(10,0)>0){
                        mp.put(10,mp.get(10)-1);
                        rem -= 10;
                    }else if(mp.getOrDefault(5,0)>0){
                        mp.put(5,mp.get(5)-1);
                        rem -= 5;
                    }else{
                        return false;
                    }
                }else{
                    if(mp.getOrDefault(5,0)>0){
                        mp.put(5,mp.get(5)-1);
                        rem -= 5;
                    }else{
                        return false;
                    }
                }
            }
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        return true;
    }
}