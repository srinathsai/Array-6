//Time complexity:- O(n).
//space complexity :- O(1).

class Solution {
    public int maxProfit(int[] prices) {
        int buy1=Integer.MAX_VALUE;
        int profit1=0;
        int buy2=Integer.MAX_VALUE;
        int profit2=0;
        for(int i=0;i<prices.length;i++){
            buy1=Math.min(buy1,prices[i]);
            profit1=Math.max(profit1,prices[i]-buy1);
            buy2=Math.min(buy2,prices[i]-profit1);//offsetting profit for next transaction.
            profit2=Math.max(profit2,prices[i]-buy2);
        }
        return profit2;
    }
}