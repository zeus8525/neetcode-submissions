class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int second = find(numbers,i+1,target-numbers[i]);
            if(second !=1001){
                return new int[]{i+1,second+1};
            }
        }
        return new int[]{0,0};
    }

    public int find(int[] nm,int i, int next){
        int st = i, ed = nm.length-1;
        while(st <= ed){
            int mid = st + (ed - st)/2;
            if(nm[mid]==next){
                return mid;
            }
            if(next < nm[mid]){
                ed = mid - 1;
            }else{
                st = mid+1;
            }
        }
        return 1001;
    }
}
