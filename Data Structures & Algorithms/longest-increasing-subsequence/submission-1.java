class Solution {
    int dp[] = null;
    public int lengthOfLIS(int[] nums) {
        this.dp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i] = -1;
        }
        int r = 0;
        for(int i=0;i<nums.length;i++){
            r = Math.max(r,dfs(nums,i));
        }
        return r;        
    }

    public int dfs(int []nums, int pos){
        if(pos>=nums.length){
            return 1;
        }
        if(dp[pos]>=0){
            return dp[pos];
        }
        int retrn = 1;
        int r = 0;
        for(int i=pos+1;i<nums.length;i++){
            if(nums[i] > nums[pos]){
                r = Math.max(r,dfs(nums,i));
            }
        }
        return dp[pos]=(r+retrn);
    }
}
