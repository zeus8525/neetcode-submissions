class Solution {
    public int rob(int[] nums) {
        int n_3=0,n_2=0,n_1=0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i-2>=0){
                max=Math.max(max, nums[i]+n_2);
            }else{
                max = Math.max(max,nums[i]);
            }
            if(i-3>=0){
                max=Math.max(max,nums[i]+n_3);
            }else{
                max = Math.max(max,nums[i]);
            }
            n_3=n_2;
            n_2=n_1;
            n_1=max;
        }
        return max;
    }
}
