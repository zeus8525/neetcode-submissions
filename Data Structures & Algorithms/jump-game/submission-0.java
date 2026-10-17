class Solution {
    public boolean canJump(int[] nums) {
        int curr = 0;
        int i = 0;

        while(i < nums.length){
            
            if(i==nums.length-1) return true;
            
            if(nums[i]+i > curr){
                curr = i+ nums[i];
            }
            if(curr == i && i <nums.length-1){
                return false;
            }
            i++;
        }
        return false;
    }
}
