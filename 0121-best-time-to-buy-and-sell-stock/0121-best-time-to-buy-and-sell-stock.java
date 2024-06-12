class Solution {
    public int maxProfit(int[] prices) {
        int buyPrize = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrize<prices[i]){
                int profit = prices[i] - buyPrize;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyPrize = prices[i];
            }
        }
        return maxProfit;
    }
}