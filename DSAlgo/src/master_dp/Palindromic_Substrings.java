package master_dp;

import java.util.Arrays;

public class Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abccbc" ;
		int n = str.length() ;		
		int[][] matrix1 = new int[n][n] ;
		//Find count of all palindromic strings
		//findPalindromicStrings(str,matrix1);
		
		//Find length of the longest palindromic string
		int[][] matrix2 = new int[n][n] ;
		findLengthOfLongestPalindrmicString(str, matrix2);
	}

	private static void findLengthOfLongestPalindrmicString(String str, int[][] matrix) {
		// TODO Auto-generated method stub
		int n = str.length() ;

		for(int i = 0 ; i < n ; i++) {
			for(int j= 0 ; j <= i ; j++) {
				if(i == j) {
					matrix[i][j] = 1 ;
				}else {
					matrix[i][j] = -1 ;
				}
			}
		}
		int count = 0; 
		int left = -1 ;
		int right = -1 ;
		for (int i = n-2; i >= 0 ; i--) {
			for(int j = i+1 ; j < n ; j++) {
				if(str.charAt(i) == str.charAt(j) && matrix[i+1][j-1] >= 1 ) {
					matrix[i][j] = matrix[i+1][j-1]+ 2 ;
					if(count < matrix[i][j]) {
						count = matrix[i][j] ;
						left = i ;
						right = j ;
					}
				}
				if(str.charAt(i) == str.charAt(j) && matrix[i+1][j-1] == -1 ) {
					matrix[i][j] = 2 ;
					if(count < matrix[i][j]) {
						count = matrix[i][j] ;
					}
					left = i ;
					right = j ;
				}
			}
		}
		
		System.out.println("Length of lonest palindromic substring-> "+str.substring(left, right+1).length());
		System.out.println("Longest Palindromic substring is -> "+ str.substring(left, right+1));
		Arrays.stream(matrix).forEach(
				(row) -> {
					System.out.print("[");
					Arrays.stream(row).
					forEach((el)-> System.out.print(" "+el+" "));
					System.out.println("]");
						
				});
		
		
	}

	private static void findPalindromicStrings(String str, int[][] matrix) {
		// TODO Auto-generated method stub
		int n = str.length() ;

		for(int i = 0 ; i < n ; i++) {
			for(int j= 0 ; j <= i ; j++) {
				if(i == j) {
					matrix[i][j] = 1 ;
				}else {
					matrix[i][j] = -1 ;
				}
			}
		}
		int count = n ; 
		for (int i = n-2; i >= 0 ; i--) {
			for(int j = i+1 ; j < n ; j++) {
				if(str.charAt(i) == str.charAt(j) && matrix[i+1][j-1] == 1 ) {
					matrix[i][j] = 1 ;
					count++ ;
				}
				if(str.charAt(i) == str.charAt(j) && matrix[i+1][j-1] == -1 ) {
					matrix[i][j] = 1 ;
					count++ ;
				}
			}
		}
		
		System.out.println(count);
		Arrays.stream(matrix).forEach(
				(row) -> {
					System.out.print("[");
					Arrays.stream(row).
					forEach((el)-> System.out.print(" "+el+" "));
					System.out.println("]");
						
				});
		
	}
	
	
	
	
	

}
