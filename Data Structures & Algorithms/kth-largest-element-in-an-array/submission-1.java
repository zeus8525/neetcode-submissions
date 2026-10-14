class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums,0,nums.length-1,nums.length-k);
    }

    public int quickSelect(int nums[],int low, int high, int k){
        if(low <= high){
            int part = partition(low,high,nums);
            if(part == k) return nums[part];
            if(part > k){
                return quickSelect(nums, low, part-1,k);
            }else{
                return quickSelect(nums, part + 1, high,k);
            }
        }
        return 0;
    }

    private int partition(int low, int high, int[]nums){
        int i = low-1;
        int j = low;

        int pivot = nums[high];
        for(int m = low;m<=high-1;m++){
            if(nums[m] < pivot){
                i++;
                swap(nums,i,m);
            }
        }
        swap(nums,i+1,high);
        return i+1;
    }

    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] =nums[j];
        nums[j] = temp;
    }
}
