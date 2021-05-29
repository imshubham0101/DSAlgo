package may_long;

import java.util.Scanner;

public class Tictactoe2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0 % 3);
//		int t ;
//		t = sc.nextInt();
//		sc.nextLine();
//		while(t-- > 0) {
//			tictactoe();
//		}
//		
		//tictactoe();
	}
	
	public static void tictactoe() {
		char[][] cmatrix = new char[3][3];
		int nx = 0 ;
		int no = 0 ;
		int ns = 0 ; 
		
		String[] matrix = new String[3] ;
		//sc.hasNextLine();
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = sc.nextLine();
		}
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length(); j++) {
				if(matrix[i].charAt(j) == 'X') {
					cmatrix[i][j] = 'X' ;
					nx++;
				}
				if(matrix[i].charAt(j) == 'O') {
					cmatrix[i][j] = 'O' ;
					no++;
				}
				if(matrix[i].charAt(j) == '_') {
					cmatrix[i][j] = '_' ;
					ns++;
				}
			}
		}
		
		System.out.println(checkMatrix(cmatrix, nx, no, ns));
		
	}
	
	public static int checkMatrix(char[][] matrix , int nx , int no , int ns) {
		
		int wx = 0 ;
		int wo = 0 ;
		//check by row 
		for(int i = 0 ; i < 3 ; i++) {
			if((matrix[i][0] == matrix[i][1]) &&(matrix[i][0] == matrix[i][2])) {
				if(matrix[i][0] == 'X') wx++;
				else if(matrix[i][0] == 'O') wo++;
			}
		}
		
		//check by cols
		for (int i = 0; i < 3; i++) {
			if((matrix[0][i] == matrix[1][i]) && (matrix[0][i] == matrix[2][i])) {
				if(matrix[0][i] == 'X') wx++;
				else if(matrix[0][i] == 'O') wo++;
			}
		}
		
		//check by diag
		if((matrix[0][0] == matrix[1][1]) && (matrix[0][0] == matrix[2][2])) {
			if(matrix[0][0] == 'X') wx++;
			else if(matrix[0][0] == 'O') wo++;
		}
		if((matrix[0][2] == matrix[1][1] )&& (matrix[0][2] == matrix[2][0])){
			if(matrix[0][2] == 'X') wx++;
			else if(matrix[0][2] == 'O') wo++;
		}
		
		
		if(no > nx) return 3 ;
		else if(nx - no > 1) return 3 ;
		else if((nx > no) && wx==1 && wo==0) return 1 ;
		else if((nx == no) && wx==0 && wo==1) return 1 ;
		else if((ns==0) && (wx+wo==0))return 1;
		else if((ns==0) && wx==2) return 1 ;
		else if((ns>0)	&& wx+wo==0) return 2 ;
		else return 3;
		
	}

}
