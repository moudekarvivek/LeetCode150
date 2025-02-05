//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
//121. Best Time to Buy and Sell Stock
public class BestBuySell {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            int currentProfit = prices[i] - minPrice;
            if(currentProfit > maxProfit){
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
