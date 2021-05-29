package may_long;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
//couldn't solve
public class ModularEquation {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		while(t-- > 0) {
		System.out.println(modEquation());
		}
	}
	
	public static long mEquation1() {
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long count = 0 ;
		//long arr[]  = new long[n+1];
		
		for (long i = 2; i <= n ; i++) {
			long a = 0;
			long b = i ;
			while(a < b) {
				if(m-(m%b) %a == 0) {
					count++;
					a++;
				}
			}
			
		}
		
		return 0 ; 
	}
	public static long modEquation() {
		long n = sc.nextLong() ;
		long m = sc.nextLong() ;
		//Pair p = new Pair();
		List<Long> list = new ArrayList<>();
		for (long i = n; i > 1; i--) {
			long y = m % i ;
			long f = m - y ;
			for(long j = 1 ; j <= Math.sqrt(f) ; j++) {
				if(f % j == 0 && j < i) {
					list.add(j);
					list.add(i);
					if(j != f/j && (f/j)<i) {
						list.add(f/j);
						list.add(i);
					}
					
				}
				
			}
			
		}
		return list.size()/2;
				
	} 
	
	
}
