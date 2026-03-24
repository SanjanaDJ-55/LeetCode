class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        int n =prices.length;
        for(int e:prices){
            if(e<minPrice){
                minPrice = e;
            }
            int cur=e - minPrice;
            if(maxProfit<cur){
                maxProfit = cur;
            }
        }

        
        return maxProfit;
        }

        
    }