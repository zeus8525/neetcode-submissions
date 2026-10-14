class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int next = nums[i];
            int cnt = 1;
            while(set.contains(next+1)){
                next++;
                cnt ++;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}
