class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==1) return 0;
        int max = 0;
        int left = 0;
        int minprice = prices[left];
        for(int right = 1; right<n ;right++){
            int curr = prices[right]- prices[left];
            if(prices[left]>prices[right]) left = right;
            max = Math.max(max,curr);
        }
        
        return max;
        
    }
}
