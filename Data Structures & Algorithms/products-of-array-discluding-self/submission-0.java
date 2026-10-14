class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==1 || nums.length==0) return nums;
        int ltr[] = new int[nums.length];
        int rtl[] = new int[nums.length];
        int mul=1;
        for(int i=0;i<nums.length;i++){
            mul *= nums[i];
            ltr[i] = mul;
        }
        mul = 1;
        for(int i=nums.length-1;i>=0;i--){
            mul *= nums[i];
            rtl[i] = mul;
        }
        int res [] = new int[nums.length];
        res[0]=rtl[1];
        res[nums.length-1]=ltr[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            res[i] = ltr[i-1] * rtl[i+1];
        }
        return res;
    }
}  
