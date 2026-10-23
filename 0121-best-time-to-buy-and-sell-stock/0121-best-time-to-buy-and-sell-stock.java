class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int ans = 0;
        while(j < prices.length){
            if(prices[i] < prices[j]){
                int profit = prices[j] - prices[i];
                ans = Math.max(profit, ans);
            }else{
                i = j;
            }
            j++;
        }
        return ans;
    }
}