package may_long;

import java.util.Scanner;

public class Tictactoe {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int t ;
//		t = sc.nextInt();
//		sc.nextLine();
//		while(t-- > 0) {
//			tictactoe();
//		}
		
		tictactoe();
	}
	
	
	
	public static void tictactoe() {
		String[] matrix = new String[3] ;
		//sc.hasNextLine();
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = sc.nextLine();
		}
		
		int[][] imatrix = new int[3][3] ;
		int nx = 0 ;
		int no = 0 ;
		int ns = 0 ;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length(); j++) {
				if(matrix[i].charAt(j) == 'X') {
					imatrix[i][j] = 1 ;
					nx++;
				}
				if(matrix[i].charAt(j) == 'O') {
					imatrix[i][j] = 0 ;
					no++;
				}
				if(matrix[i].charAt(j) == '_') {
					imatrix[i][j] = -10 ;
					ns++;
				}
			}
		}
		
		System.out.println(checkMatrix(imatrix, ns, nx, no));
		
	}
	
	public static int checkMatrix(int[][] imatrix , int ns , int nx , int no) {
		//1.no of spaces are even
		
		int[] result = new int[2] ;
		
				checkByRow(imatrix, result); 
				checkByCol(imatrix, result);
				checkByDiag(imatrix,result);
		if(ns == 0){
			
		if ((nx == 5) && (no == 4)) {
			if((result[0] > 0) && result[1] == 0) {
				return 1 ;
			}else if(result[0] == 0 && result[1] == 0 ){
				return 2 ;
			}else
				return 3 ;
		}else 
			return 3 ;
		}
		
		if(ns % 2 == 0) { 	//even case
			if(nx == no+1) { //x should be winner or draw
				if(result[0] == 0 && result[1] == 0)
					return 2 ;
				else if(result[0] == 1 && result[1] == 0)
					return 1 ;
				else 
					return 3 ;
			}else 
				return 3 ;
		}else if(ns % 2 != 0) {	//odd case
			if(nx == no) {	//o should be winner or draw
				if(result[0] == 0 && result[1] == 0)
					return 2 ;
				else if(result[0] == 0 && result[1] == 1)
					return 1 ;
				else 
					return 3 ;
			}else 
				return 3 ;
		}
			
		
		
		return 3 ;
	}
	
	public static void checkByRow(int[][] imatrix , int[] result  ) {
		int sum = -1;
		for(int i = 0 ; i < 3 ; i++) {
			sum = imatrix[i][0] + imatrix[i][1] +imatrix[i][2] ; //check by row
			if(sum == 3) result[0] = result[0]+1 ;
			if(sum == 0) result[1] = result[1]+1 ;
		}
		
		
		return ;
		
	}
	
	public static void checkByCol(int[][] imatrix ,  int[] result  ) {
		int sum = -1 ; //some random value 
		for (int j = 0; j < 3; j++) {
			sum = imatrix[0][j] + imatrix[1][j] +imatrix[2][j] ;
			if(sum == 3) result[0] = result[0]+1 ;
			if(sum == 0) result[1] = result[1]+1 ;
		}
			 
		
		
		return ;
		
	}
	
	public static void checkByDiag(int[][] imatrix , int[] result  ) {
		//int sum  ; //some random value 
		
			int sumLeft = imatrix[0][0] + imatrix[1][1] +imatrix[2][2] ;
			int sumRight = imatrix[0][2] + imatrix[1][1] +imatrix[2][0] ;
			
			if((sumLeft == 3)||(sumRight == 3)) {
				result[0] = result[0]+1 ;
			}
		if((sumLeft == 0)||(sumRight == 0))
		result[1] = result[1]+1 ;
		return ;
		
	}
	
	
	
	

}
