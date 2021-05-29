package lunchtime;

import java.util.Scanner;

public class CCHEAVEN {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = sc.nextInt();
		while(t-- > 0) {
			printHeaven();
		}
		
	}
	private static void printHeaven() {
		// TODO Auto-generated method stub
		int gCount = 0 ;
		int l =  sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				gCount++;
				int rate  = (gCount * 100) / (i+1) ;
				if(rate >= 50)	{
					System.out.println("YES");
					return ;
				}
			}
			
		}
		System.out.println("NO");
		return ;
	}

}
