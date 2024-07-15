import static java.lang.Math.max;

class Solution {
    public int maxProfit(int[] prices) {
        
        //return 0;
        int l = 0;
        int r = 1;
        int maxP = 0;

        while( r < prices.length){
            if (prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxP = max(maxP, profit);
            }else{
                l = r;
            }
            r += 1;
        }
        return maxP;
    }
}