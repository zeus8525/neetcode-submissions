class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,nums,0,new ArrayList<Integer>());
        return res;
    }

    public void dfs(List<List<Integer>> res,int[] nums,int pos,List<Integer> curr){
        res.add(new ArrayList<>(curr));
        for(int i=pos;i<nums.length;i++){
            curr.add(nums[i]);
            dfs(res,nums,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}
