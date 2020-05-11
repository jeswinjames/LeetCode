package LeetCode.array;

public class LC122 {
    public static int maxProfit(int[] prices) {
        int max = 0;
        int sum = 0;
        int start = 0;
        int end = 1;
        while(end < prices.length){
            int profit = prices[end] - prices[start];
            if(profit < max){
                start = end;
                sum = sum+max;
                max = 0;
            }else if(profit > max){
                max = profit;
            }
            end++;
        }
        return max;
    }
}
