class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        dfs(res, nums, new ArrayList<Integer>(),0);
        return res;
    }

    public void dfs(List<List<Integer>> res, int[] nums, List<Integer> curr, int pos){
        res.add(new ArrayList<>(curr));
        if(pos >=nums.length){
            return;
        }
        
        for(int i=pos;i<nums.length;i++){
            if(i-1>=pos && nums[i-1]==nums[i]){
                continue;
            }
            curr.add(nums[i]);
            dfs(res,nums,curr,i+1);
            curr.remove(curr.size()-1);
        }
    }
}
