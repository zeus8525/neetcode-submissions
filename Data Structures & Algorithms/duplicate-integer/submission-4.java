class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}