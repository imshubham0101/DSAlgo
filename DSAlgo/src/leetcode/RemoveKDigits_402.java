package leetcode;

public class RemoveKDigits_402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "1432219" ;
		//String num = "119";
		int k = 4 ;
		System.out.println(printRemoveKDigits(num,k));
	}

	private static String printRemoveKDigits(String num1 , int k) {
		// TODO Auto-generated method stub
		StringBuilder num = new StringBuilder(num1);
		for (int i = 0; i < num.length()-1 && k > 0; i++) {
			int curNum = Character.getNumericValue(num.charAt(i)); 
			int nextNum = Character.getNumericValue(num.charAt(i+1));
			if(curNum > nextNum) {
				num.deleteCharAt(i);
				k--;
				--i;
			}else {
				continue;
			}
		}
//		if(k == 1) {
//			num.deleteCharAt(num.length()-1);
//		}
		return num.toString();
	}

}
