class Solution {
    public void sortColors(int[] nums) {
        int one=0;
        int two=nums.length-1;
        int crawl=0;
        while(crawl<=two){
            if(nums[crawl]==0){
                swap(nums,crawl,one);
                one++;
            }else if(nums[crawl]==2){
                swap(nums,crawl,two);
                two--;
                continue;
            }
            crawl++;
        }
    }

    public void swap(int nums[],int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}