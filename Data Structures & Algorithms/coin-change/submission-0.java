class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        for(int i=1;i<=amount;i++){
            dp[i] = 10001;
        }        
        dp[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(j-coins[i]>=0)
                    dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]==10001?-1:dp[amount];
    }
}
