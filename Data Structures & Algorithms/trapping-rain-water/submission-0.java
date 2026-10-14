class Solution {
    public int trap(int[] height) {
        int ltr[] = new int[height.length];
        int rtl[] = new int[height.length];

        for(int i=0;i<height.length;i++){
            if(i==0){
                ltr[i] = height[i];
            }else{
                ltr[i]=Math.max(ltr[i-1],height[i]);
            }
        }
        for(int i=height.length-1;i>=0;i--){
            if(i==height.length-1){
                rtl[i] = height[i];
            }else{
                rtl[i]=Math.max(rtl[i+1],height[i]);
            }
        }

        int res = 0;
        for(int i=1;i<height.length-1;i++){
            int min = Math.min(ltr[i-1],rtl[i+1])-height[i];
            if(min>0)
                res += min;
        }
        return res;
    }
}
