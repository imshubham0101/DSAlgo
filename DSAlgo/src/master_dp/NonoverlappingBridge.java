package master_dp;

import java.util.Arrays;

public class NonoverlappingBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] start = {8, 1, 4, 3, 5, 2, 6, 7} ;
		int[] end = {1, 2 ,3 ,4 ,5 ,6 ,7 ,8} ;
		
		System.out.println(countBridges(start,end));
	}

	private static int countBridges(int[] start, int[] end) {
		// TODO Auto-generated method stub
		int[] count = new int[start.length] ; 
		Arrays.fill(count, 1);
		for(int i=1 ; i<start.length ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if((start[i] > start[j] && end[i] > end[j]) || (start[i] < start[j] && end[i] < end[j]) ) {
					int newCount = count[j] + 1 ;
					if(count[i] < newCount ) {
						count[i] = newCount ;
					}
				}
			}
			
		}
		
		//Arrays.stream(count).forEach(System.out::println);
		return Arrays.stream(count).max().getAsInt();
		
		
	}

}
