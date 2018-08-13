package array;

public class Question11 {
	public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int margain = 0;
        for(int i = 1; i < prices.length; i++){
            margain = prices[i] - prices[i-1];
            if(margain > 0)
                maxProfit += margain;
        }
        return maxProfit;
    }
}
