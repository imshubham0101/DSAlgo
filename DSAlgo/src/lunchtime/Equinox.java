package lunchtime;

import java.util.Scanner;

public class Equinox {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			printEquinox();
		}
	}
	

	private static void printEquinox() {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		String eq = "EQUINOX";
		long sarthakCount = 0;
		long anuradhaCount = 0;
		String[] str = new String[n];
		sc.nextLine();
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].isEmpty()) continue ;
			String firstChar = Character.toString(str[i].charAt(0));
			if(eq.contains(firstChar)){
				sarthakCount += a ;
			}else {
				anuradhaCount += b ;
			}
		}
		
		if(sarthakCount > anuradhaCount) {
			System.out.println("SARTHAK");
		}else if(sarthakCount < anuradhaCount){
			System.out.println("ANURADHA");
		}else {
			System.out.println("DRAW");
		}
	}

}
