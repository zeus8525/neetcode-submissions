class Solution {
    public int search(int[] nums, int target) {
        int st = 0, ed=nums.length-1;

        while(st<ed){
            int mid = st + (ed - st)/2;
            if(target == nums[mid]) return mid;
            if(target < nums[mid]){
                ed = mid -1;
            }else{
                st = mid + 1;
            }
        }
        return target == nums[st]? st:-1;
    }
}
