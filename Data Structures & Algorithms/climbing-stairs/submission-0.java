class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 2;
        if(n==1) return one;
        if(n==2) return two;

        int sum = 0;
        for (int i=3;i<=n;i++){
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }
}
