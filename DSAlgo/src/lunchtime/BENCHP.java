package lunchtime;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BENCHP {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		while(t-- > 0) {
			printBenchp();
		}
	}
	private static void printBenchp() {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		Long w = sc.nextLong();
		Long wr = sc.nextLong();
		
		Long[] arr = new Long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
			
		}
		if(wr >= w ) {
			System.out.println("YES");
			return ;
		}
		Long balance = w - wr ;
		
		 
		Arrays.sort(arr,Collections.reverseOrder());
		
		int i = 0 ;
		while(i < arr.length-1) {
			
			if(arr[i] == arr[i+1]) {
				balance -= (2*arr[i]);
				i+=2;
				if(balance <= 0) {
					System.out.println("YES");
					return ;
				}
			}else {
				i++;
			}
		}
		
		System.out.println("NO");
		return ;
				
	}
	
	

}
