package leetcode;

import java.util.Arrays;

public class Arrows_452 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] points = {{10,16},{2,8},{1,6},{7,12}};
		//int[][] points = {{1,2},{2,3},{3,4},{4,5}};
		int[][] points = {{-2147483646,-2147483645},{2147483646,2147483647}};
		System.out.println(findMinArrowShots(points));
	}
	
    public static long findMinArrowShots(int[][] points) {
        
    	Arrays.sort(points , (a,b) -> a[1] - b[1]) ;
    	long globalEnd =  points[0][1] ;
    	long maxArraows =  1 ;
    	for (int i = 1; i < points.length; i++) {
			 long start = points[i][0] ;
			 long end = points[i][1] ;
			 if(start <= globalEnd) {
				 continue;
				 
			 }else {
				 globalEnd = end ;
				 maxArraows++;
			 }
    		
		}
    	
    	return maxArraows ; 
    }

}
