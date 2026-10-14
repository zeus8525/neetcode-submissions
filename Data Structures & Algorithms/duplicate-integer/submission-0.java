class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> in = new HashSet<>();
        for(int i:nums){
            if(in.contains(i)){
                return true;
            }
            in.add(i);
        }
        return false;
    }
}
