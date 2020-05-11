package LeetCode.array;

public class LC121 {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - buyPrice;
            if(profit <0){
                buyPrice = prices[i];
            }else if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
