class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        for(int i = 0 ;i< prices.length ;i++){
            for (int j=i ; j < prices.length ; j++){
                int val = prices[j]-prices[i];
                max = Math.max(max,val);
            }
        }
        return max;
    }
}
