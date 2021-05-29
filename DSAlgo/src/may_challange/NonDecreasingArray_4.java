package may_challange;

public class NonDecreasingArray_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,2,3};
		//int[] nums = {5,7,1,8};
		//{4,2,3}
		System.out.println(checkPossibility(nums));

	}

	public static boolean checkPossibility(int[] nums) {
        
		int gc = 1 ; //globalCount
		//int maxima  = nums[0] ;
		for (int i = 1; i < nums.length-1; i++) {

			if(nums[i] > nums[i-1]) {
				
			}else {
				if(gc == 1 && nums[i-1] < nums[i+1]) {
					nums[i] = nums[i-1] ;
					gc = 0 ;
				}else if(gc == 1 && nums[i-1] > nums[i+1] && nums[i-2] <= nums[i]) {
					nums[i-1] = nums[i];
					gc = 0; 
				}else if(gc == 1 && nums[i-1] > nums[i+1] && nums[i-2] > nums[i]) {
					return false ;
				}
				else if(gc == 0) {
					return false ;
				}
			}
			
			
    }
		return true ;
}
}
