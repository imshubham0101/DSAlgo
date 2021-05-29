package leetcode;

public class Stock_122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] prices = {7,1,5,3,6,4};
		int[] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));

	}

	private static int  maxProfit(int[] prices) {
		 int profit = 0 ;
	        int currMin = prices[0] ;
	        for(int i=1; i < prices.length ; i++){
	            if(prices[i] < currMin){
	                currMin = prices[i];
	                continue;
	            }
	            
	            if(prices[i] > currMin){
	                profit += prices[i]-currMin ;
	                currMin = prices[i] ;
	            }
	        }
	        return profit ;
	        
	}

}
