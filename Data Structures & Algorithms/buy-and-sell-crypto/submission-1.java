class Solution {
    public int maxProfit(int[] prices) {

        //buy low, sell high
        // what we want is to find whenever left < right
        int maxProfit = 0;
        int left = 0;
        int right = 0;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            }else{
                left = right;
            }
            right++;
        }
        return maxProfit;
        
    }
}
