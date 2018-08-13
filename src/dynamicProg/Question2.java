package dynamicProg;

//import java.util.ArrayList;

public class Question2 {
	//时间复杂度O(n^2),空间复杂度O(n^2)
//	public int maxProfit(int[] prices) {
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int i = 0; i < prices.length; i++) {
//			for(int j = i+1; j < prices.length; j++) {
//				list.add(prices[j]-prices[i]);
//			}
//		}
//		int max = 0;
//		for(Integer element:list) {
//			if(element > max)
//				max = element;
//		}
//		return max;
//    }
	
	//时间复杂度O(n),空间复杂度O(1)
	public int maxProfit(int[] prices) {
		//1.始终保存最小买入价格
		//2.始终保存最大利润
		int profit = 0;
		int minbuy = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++) {
			minbuy = (minbuy > prices[i]) ? prices[i] : minbuy;
			profit = (profit > (prices[i]-minbuy)) ? profit : prices[i]-minbuy; 
		}
		return profit;
	}
	
	
}
