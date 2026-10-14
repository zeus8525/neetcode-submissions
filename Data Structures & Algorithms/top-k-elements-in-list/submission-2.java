class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Integer res1[] = map.keySet().stream().toArray(Integer[]::new);
        Arrays.sort(res1, (i, j) -> map.get(j) - map.get(i));
        int res2[] = new int[k];
        for(int i=0;i<k;i++){
            res2[i] = res1[i];
        }
        return res2;
    }
}
