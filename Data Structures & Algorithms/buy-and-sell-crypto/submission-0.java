class Solution {
    public int maxProfit(int[] prices) {
        int min = 1000;
        int max = 0;
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];  
                max = 0; 
            }
            if(prices[i]>max){
                max = prices[i];
                profit = Math.max(profit,max - min);
            }
        }
        return profit;
    }
}
