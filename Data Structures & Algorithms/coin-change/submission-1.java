class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        IntStream.range(0, dp.length)
            .forEach(index -> {dp[index]=10001;});
        Arrays.sort(coins);
        dp[0] = 0;
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<=amount;j++){
                int diff = j - coins[i];
                if(diff >= 0){
                    dp[j] = Math.min(dp[j],dp[diff] + 1);
                }
            }
        }
        return dp[amount]>=10001?-1:dp[amount];
    }
}
