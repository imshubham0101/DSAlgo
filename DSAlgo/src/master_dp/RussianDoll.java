package master_dp;

import java.util.Arrays;

public class RussianDoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] width = {17,26,25,48,63,42};
//		int[] length = {5,18,34,84,72,86};
		//int[] width = {5,6,6,2};
		//int[] length = {4,4,7,3};
		int[][] envelopes = {{5,4},{6,7},{6,4},{2,3}};
		
		System.out.println(nestedEnvelopes(envelopes));
	}

	private static int nestedEnvelopes(int[][] envelopes) {
		// TODO Auto-generated method stub
		
	    int[] count = new int[envelopes.length];
			Arrays.fill(count, 1);
			Arrays.sort(envelopes,(a,b) -> a[0] - b[0]);
//			Arrays.stream(envelopes).forEach((i) -> {
//				Arrays.stream(i).forEach(System.out::print);
//				System.out.println();
//			});
			for(int i = 1 ; i<envelopes.length ; i++) {
				for(int j = 0 ; j < i ; j++) {
					if((envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1])) {
						int newCount = count[j] + 1 ;
						if(count[i] < newCount ) {
							count[i] = newCount ;
						}
					}
				}
			}
		//Arrays.stream(count).forEach(System.out::println);
		System.out.println("********Ans*******");
		return Arrays.stream(count).max().getAsInt();
	}
	
	

}
