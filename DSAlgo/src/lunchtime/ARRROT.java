package lunchtime;

import java.util.Scanner;

public class ARRROT {

	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printRoatation();
	}

	public static void printRoatation(){
	    int n = sc.nextInt();
	    long[] arr = new long[n];
	    long arraySum = 0 ;
	    for(int i = 0 ; i< arr.length ; i++){
	        arr[i] = sc.nextLong();
	        arraySum += arr[i];
	    }
	    int q = sc.nextInt();
	    long[] xarray = new long[q];
	    for(int i= 0 ; i < xarray.length ; i++){
	        xarray[i] = sc.nextLong();
	        
	    }
	   // System.out.println(arraySum);
	    while(q-- > 0) {
	    	arraySum *= 2 ;
	    	System.out.println(arraySum);
	    }
	   // double result = Math.pow(arraySum , q );
	   // System.out.println(result);
	    
	    
	    
	}
}
