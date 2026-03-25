class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            int cur = price - min;
            if (maxProfit < cur) {
                maxProfit = cur;
            }
        }
        return maxProfit;

    }
}