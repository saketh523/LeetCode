class Solution {
    public int maxProfit(int[] prices) {
        
        int currSell = 0, maxProfit = 0, low = 10000;

        for(int i=0; i< prices.length; i++){
            // min logic
            if(prices[i] < low){
                low = prices[i];
            }
            // Profit if sold at the current time
            currSell = prices[i] - low;

            // Max Profit at the end
            if(currSell > maxProfit) {
                maxProfit = currSell;
            }
            
        }
        return maxProfit;        
    }
}
