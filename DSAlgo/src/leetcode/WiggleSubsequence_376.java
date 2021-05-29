package leetcode;

import java.util.Stack;

public class WiggleSubsequence_376 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 7, 4, 5, 5};
		System.out.println(wiggleMaxLength(nums));

	}
	
	private static int wiggleMaxLength(int[] nums) {
        
		Stack<Integer>st = new Stack<>();
		
		for (int i = 1; i < nums.length; i++) {
			int currDiff = nums[i]-nums[i-1];
			if(st.isEmpty()) {
				st.push(currDiff);
				continue;
			}
			int currSign = currDiff % 2 ;
			int prevSign = st.peek() % 2 ;
			if(currSign == prevSign) {
				st.clear();
				continue;
			}
			st.push(currDiff);
			
		}
		return st.size()+1;
		
    }

}
